package com.example.library.service

import com.example.library.domain.Author
import com.example.library.domain.Book
import com.example.library.repository.AuthorRepository
import com.example.library.repository.BookRepository
import org.springframework.stereotype.Service

@Service
class AuthorService(val authorRepository: AuthorRepository) {
    fun getAll(): MutableList<Author> {
        return authorRepository.findAll()
    }

    fun add(newAuthor: Author): Author {
        return authorRepository.save(newAuthor)
    }

    fun delete(author: Author) {
        return authorRepository.delete(author)
    }
}
