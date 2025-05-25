package com.barber.barber.service;

import com.barber.barber.model.Book;
import com.barber.barber.model.Review;
import com.barber.barber.repository.BookRepository;
import com.barber.barber.repository.ReviewRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class ReviewService {
    private final ReviewRepository reviewRepository;

    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    public List<Review> getAllUsers() {
        return reviewRepository.findAll();
    }
    public Review createUser(Review review){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        String currentDate = dateFormat.format(new Date());
        review.setDate(currentDate);
        return reviewRepository.save(review);
    }

    public void deleteUser(Long id){
        reviewRepository.deleteById(id);
    }
}
