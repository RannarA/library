package com.example.library.rest

import com.example.library.domain.Author
import com.example.library.service.AuthorService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("api")
class AuthorController(val authorService: AuthorService) {

    @GetMapping("/author")
    fun getAuthors(): MutableList<Author> {
        return authorService.getAll()
    }

    @PutMapping("/author")
    fun addAuthor(@RequestBody newAuthor: Author): Author {
        return authorService.add(newAuthor)
    }

    @DeleteMapping("/author")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    fun deleteAuthor(@RequestBody author: Author) {
        authorService.delete(author)
    }
}
