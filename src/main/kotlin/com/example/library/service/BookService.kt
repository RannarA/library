package com.example.library.service

import com.example.library.domain.Book
import com.example.library.repository.BookRepository
import org.springframework.stereotype.Service

@Service
class BookService(val bookRepository: BookRepository) {
    fun getAll(): MutableList<Book> {
        return bookRepository.findAll()
    }

    fun add(newBook: Book): Book {
        return bookRepository.save(newBook)
    }

    fun delete(book: Book) {
        return bookRepository.delete(book)
    }
}
