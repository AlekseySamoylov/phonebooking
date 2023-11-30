package com.alekseysamoylov.phonebook.controller

import com.alekseysamoylov.phonebook.model.PhoneBook
import com.alekseysamoylov.phonebook.service.PhoneBookService
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api/book")
class BookController(@Autowired val phoneBookService: PhoneBookService) {
    private val log = LoggerFactory.getLogger(this::class.java)

    @PostMapping("/book")
    fun bookPhone(@RequestBody phoneBook: PhoneBook) {
        log.info("Book {}", phoneBook)
        phoneBookService.bookPhone(phoneBook)
    }

    @PostMapping("/return")
    fun returnPhone(@RequestBody phoneBook: PhoneBook) {
        log.info("Return {}", phoneBook)
        phoneBookService.returnPhone(phoneBook)
    }
}
