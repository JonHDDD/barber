package com.barber.barber.controller;

import com.barber.barber.model.Review;
import com.barber.barber.service.ReviewService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("review")
public class ReviewController {
    private final ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @GetMapping
    public List<Review> getAllUsers(){
        return reviewService.getAllUsers();
    }

    @PostMapping
    public Review createUser(@RequestBody Review review){
        return reviewService.createUser(review);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        reviewService.deleteUser(id);
    }
}

