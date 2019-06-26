package com.alekseysamoylov.phonebook.controller

import com.alekseysamoylov.phonebook.model.PhoneDto
import com.alekseysamoylov.phonebook.service.PhoneService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/phone")
class PhoneController(@Autowired private val phoneService: PhoneService) {

    @GetMapping
    fun getAllAvailable(): Iterable<PhoneDto> {
        return phoneService.getAllAvailable()
    }
}
