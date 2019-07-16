package com.example.library.rest

import com.example.library.domain.Book
import com.example.library.service.BookService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("api")
class BookController(val bookService: BookService) {

    @GetMapping("/book")
    fun getBooks(): MutableList<Book> {
        return bookService.getAll()
    }

    @PutMapping("/book")
    fun addBook(@RequestBody newBook: Book): Book {
        return bookService.add(newBook)
    }

    @DeleteMapping("/book")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    fun deleteBook(@RequestBody book: Book) {
        bookService.delete(book)
    }
}
