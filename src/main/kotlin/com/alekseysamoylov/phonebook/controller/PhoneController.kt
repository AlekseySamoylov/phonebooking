package com.alekseysamoylov.phonebook.controller

import com.alekseysamoylov.phonebook.entity.Phone
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/phone")
class PhoneController {

    @GetMapping
    fun getAll(): Iterable<Phone> {
        return listOf(Phone("a"), Phone("b"))
    }
}
