package com.barber.barber.controller;

import com.barber.barber.model.Book;
import com.barber.barber.service.BookService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("book")
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService){
        this.bookService = bookService;
    }

    @GetMapping
    public List<Book> getAllUsers(){
        return bookService.getAllUsers();
    }

    @PostMapping
    public Book createUser(@RequestBody Book book){
        return bookService.createUser(book);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        bookService.deleteUser(id);
    }

}
