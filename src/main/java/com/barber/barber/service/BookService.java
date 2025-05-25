package com.barber.barber.service;

import com.barber.barber.model.Book;
import com.barber.barber.repository.BookRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllUsers() {
        return bookRepository.findAll();
    }
    public Book createUser(Book book){
        return bookRepository.save(book);
    }

    public void deleteUser(Long id) {
        bookRepository.deleteById(id);
    }


}
