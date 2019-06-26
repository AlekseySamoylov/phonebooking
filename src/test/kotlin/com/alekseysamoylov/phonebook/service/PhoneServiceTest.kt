package com.alekseysamoylov.phonebook.service

import com.alekseysamoylov.phonebook.fonoapi.FonoapiConnector
import com.alekseysamoylov.phonebook.repository.PhoneRepository
import com.alekseysamoylov.test.MockitoExtension
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito


@ExtendWith(MockitoExtension::class)
internal class PhoneServiceTest {

    @Mock
    private val fonoapiConnector: FonoapiConnector =
        FonoapiConnector()
    @Mock
    private val phoneRepository: PhoneRepository = Mockito.any()

    @InjectMocks
    private val phoneService = PhoneService(fonoapiConnector, phoneRepository)

    @Test
    fun getAllAvailable() {
        // todo create tests... Not enough time...

    }
}
