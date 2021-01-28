package com.alekseysamoylov.phonebook.entity

import javax.persistence.*


@Entity
data class Phone(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @Column
    var brand: String = "",

    @Column var
    model: String = "",

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    var user: User? = null
)
