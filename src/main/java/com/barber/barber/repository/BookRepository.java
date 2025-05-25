package com.barber.barber.repository;

import com.barber.barber.model.Book;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long>{

}
