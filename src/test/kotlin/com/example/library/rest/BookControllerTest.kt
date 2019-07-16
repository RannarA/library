package com.example.library.rest

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.http.HttpStatus
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest(classes = arrayOf(BookController::class),
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class BookControllerTest {

    @Autowired
    lateinit var testRestTemplate: TestRestTemplate

//    @Before
//    fun setup() {
//        testRestTemplate = TestRestTemplate()
//    }

    @Test
    fun whenCalled_shouldReturnHello() {
        val result = testRestTemplate
                // ...
                .getForEntity("/api/book", String::class.java)

        assertNotNull(result)
        assertEquals(result?.statusCode, HttpStatus.OK)
        assertEquals(result?.body, "blah")
    }
}
