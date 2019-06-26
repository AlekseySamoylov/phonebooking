package com.alekseysamoylov.phonebook.service

import com.alekseysamoylov.phonebook.model.PhoneBook
import com.alekseysamoylov.phonebook.repository.PhoneRepository
import com.alekseysamoylov.phonebook.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import javax.transaction.Transactional


@Transactional
@Service
class PhoneBookService(
    @Autowired private val userRepository: UserRepository,
    @Autowired private val phoneRepository: PhoneRepository
) {
    fun bookPhone(phoneBook: PhoneBook) {
        val user = userRepository.findOne(phoneBook.userId)
        val phone = phoneRepository.findOne(phoneBook.phoneId)
        if (user != null && phone != null && phone.user == null) {
            phone.user = user
        } else {
            throw NoSuchElementException("No phone for book")
        }
    }

    fun returnPhone(phoneBook: PhoneBook) {
        val user = userRepository.findOne(phoneBook.userId)
        val phone = phoneRepository.findOne(phoneBook.phoneId)
        if (user != null && phone != null && phone.user == user) {
            phone.user = null
        } else {
            throw NoSuchElementException("No phone for book")
        }
    }
}
