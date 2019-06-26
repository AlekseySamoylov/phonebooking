package com.alekseysamoylov.phonebook.controller

import org.springframework.boot.autoconfigure.web.ErrorController
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Controller
class IndexController : ErrorController {

    @GetMapping("/")
    fun index(): String {
        return "index"
    }

    override fun getErrorPath(): String {
        return "index"
    }
}
