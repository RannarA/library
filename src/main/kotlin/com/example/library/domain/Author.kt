package com.example.library.domain

import javax.persistence.*

@Entity
data class Author (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,

    val firstName: String,

    val lastName: String
)
