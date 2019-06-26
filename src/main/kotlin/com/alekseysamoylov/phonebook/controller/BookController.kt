package com.alekseysamoylov.phonebook.controller

import com.alekseysamoylov.phonebook.model.PhoneBook
import com.alekseysamoylov.phonebook.service.PhoneBookService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api/book")
class BookController(@Autowired val phoneBookService: PhoneBookService) {

    @PostMapping("/book")
    fun bookPhone(phoneBook: PhoneBook) {
        phoneBookService.bookPhone(phoneBook)
    }

    @PostMapping("/return")
    fun returnPhone(phoneBook: PhoneBook) {
        phoneBookService.returnPhone(phoneBook)
    }
}
