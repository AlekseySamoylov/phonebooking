package com.alekseysamoylov.phonebook.service

import com.alekseysamoylov.phonebook.entity.Phone
import com.alekseysamoylov.phonebook.fonoapi.FonoapiConnector
import com.alekseysamoylov.phonebook.model.PhoneDto
import com.alekseysamoylov.phonebook.repository.PhoneRepository
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import javax.transaction.Transactional

@Transactional
@Service
class PhoneService(
    @Autowired val fonoapiConnector: FonoapiConnector,
    @Autowired val phoneRepository: PhoneRepository
) {
    private val log = LoggerFactory.getLogger(this::class.java)
    fun getAllAvailable(): Iterable<PhoneDto> {
        val availablePhones = phoneRepository.findAllByUserIsNull()
        log.info("Phones {}", availablePhones)

        // TODO Need to optimize!!!! Not enough time for this!!
        return availablePhones.asSequence()
            .map { parsePhone(it) } .toList()
    }

    private fun parsePhone(phone: Phone): PhoneDto {
//        val deviceEntity = fonoapiConnector.getPhoneModel(phone.brand, phone.model)[0]
        return PhoneDto(
            phone.id!!,
            phone.brand + " " + phone.model,
            "deviceEntity.technology",
            "deviceEntity._2g_bands",
            "deviceEntity._2g_bands",
            "deviceEntity._4g_band"
        )
    }
}
