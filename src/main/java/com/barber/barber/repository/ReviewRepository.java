package com.barber.barber.repository;

import com.barber.barber.model.Review;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long>{

}
