package com.alekseysamoylov.phonebook.controller

import com.alekseysamoylov.phonebook.entity.Phone
import io.swagger.annotations.ApiOperation
import io.swagger.annotations.ApiResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api/book")
class BookController {

    @ApiOperation("asdffas")
    @RequestMapping(value = ["/list"], method= arrayOf(RequestMethod.GET), produces = arrayOf("application/json"))
    fun getAll(): Iterable<Phone> {
        return listOf(Phone("a"), Phone("b"))
    }
}
