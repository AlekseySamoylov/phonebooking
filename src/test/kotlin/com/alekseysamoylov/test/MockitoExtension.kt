package com.alekseysamoylov.test


import org.junit.jupiter.api.extension.*
import org.mockito.Mock
import org.mockito.Mockito.mock
import org.mockito.MockitoAnnotations
import java.lang.reflect.Parameter


// TODO remove once Mockito officially supports Junit 5+
// See: https://github.com/mockito/mockito/issues/445

/**
 * JUnit 5+ extension for Mockito
 * Reference: https://github.com/junit-team/junit5-samples/blob/master/junit5-mockito-extension/src/main/java/com/example/mockito/MockitoExtension.java
 */
class MockitoExtension : TestInstancePostProcessor, ParameterResolver {


    override fun postProcessTestInstance(testInstance: Any, context: ExtensionContext) {
        MockitoAnnotations.initMocks(testInstance)
    }

    @Throws(ParameterResolutionException::class)
    override fun supportsParameter(parameterContext: ParameterContext, extensionContext: ExtensionContext): Boolean =
        parameterContext.parameter.isAnnotationPresent(Mock::class.java)

    @Throws(ParameterResolutionException::class)
    override fun resolveParameter(parameterContext: ParameterContext, extensionContext: ExtensionContext): Any =
        getMock(parameterContext.parameter, extensionContext)

    private fun getMock(parameter: Parameter, extensionContext: ExtensionContext): Any {
        val mockType = parameter.type
        val mocks = extensionContext.getStore(ExtensionContext.Namespace.create(MockitoExtension::class.java, mockType))
        val mockName = getMockName(parameter)

        return if (mockName != null) {
            mocks.getOrComputeIfAbsent<String, Any>(mockName) { _ -> mock(mockType, mockName) }
        } else {
            mocks.getOrComputeIfAbsent<String, Any>(mockType.canonicalName) { _ -> mock(mockType) }
        }
    }

    private fun getMockName(parameter: Parameter): String? {
        val explicitMockName = parameter.getAnnotation(Mock::class.java).name.trim { it <= ' ' }
        return when {
            !explicitMockName.isEmpty() -> explicitMockName
            parameter.isNamePresent -> parameter.name
            else -> null
        }
    }
}
