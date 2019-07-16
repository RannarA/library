package com.example.library.domain

import java.time.LocalDate
import javax.persistence.*

@Entity
data class Book (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @Column(nullable = false)
    val title: String,

    @Column(nullable = false)
    val publicationDate: LocalDate
) {
    @ManyToOne(cascade = arrayOf(CascadeType.PERSIST))
    @JoinColumn(name = "author_id")
    lateinit var author: Author
}
