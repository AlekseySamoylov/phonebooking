package com.alekseysamoylov.phonebook.repository

import com.alekseysamoylov.phonebook.entity.User
import org.springframework.data.repository.CrudRepository


interface UserRepository: CrudRepository<User, Long> {
}
