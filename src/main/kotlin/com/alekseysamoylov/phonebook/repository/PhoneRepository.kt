package com.alekseysamoylov.phonebook.repository

import com.alekseysamoylov.phonebook.entity.Phone
import org.springframework.data.repository.CrudRepository


interface PhoneRepository: CrudRepository<Phone, Long> {
    fun findAllByUserIsNull(): List<Phone>
}
