package com.alekseysamoylov.phonebook.entity

import javax.persistence.*


@Entity
class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

    @Column
    var model: String = ""

    @Column
    var brand: String = ""

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    var user: User? = null



    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Phone

        if (id != other.id) return false
        if (model != other.model) return false
        if (brand != other.brand) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id?.hashCode() ?: 0
        result = 31 * result + model.hashCode()
        result = 31 * result + brand.hashCode()
        return result
    }

    override fun toString(): String {
        return "Phone(id=$id, model='$model', brand='$brand', user=$user)"
    }


}
