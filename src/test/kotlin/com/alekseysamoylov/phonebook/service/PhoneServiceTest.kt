package com.alekseysamoylov.phonebook.service

import com.alekseysamoylov.phonebook.entity.Phone
import com.alekseysamoylov.phonebook.fonoapi.DeviceEntity
import com.alekseysamoylov.phonebook.fonoapi.FonoapiConnector
import com.alekseysamoylov.phonebook.repository.PhoneRepository
import com.alekseysamoylov.test.MockitoExtension
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.BDDMockito.given
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito.verify


@ExtendWith(MockitoExtension::class)
internal class PhoneServiceTest {

    @Mock
    lateinit var fonoapiConnector: FonoapiConnector
    @Mock
    lateinit var phoneRepository: PhoneRepository

    @InjectMocks
    lateinit var phoneService: PhoneService

    @Test
    fun getAllAvailable() {
        // Given
        val brand = "Apple"
        val model = "iphone"
        val availablePhone = Phone(id = 1, brand = brand, model = model)
        val deviceEntity = DeviceEntity(brand = brand, deviceName = model)
        given(phoneRepository.findAllByUserIsNull()).willReturn(listOf(availablePhone))
        given(fonoapiConnector.getPhoneModel(availablePhone.brand, availablePhone.model))
            .willReturn(listOf(deviceEntity))

        // When
        val phoneDto = phoneService.getAllAvailable().toList()[0]

        // Then
        verify(phoneRepository).findAllByUserIsNull()
        verify(fonoapiConnector).getPhoneModel(availablePhone.brand, availablePhone.model)
        assertEquals(model, phoneDto.name)
    }
}
