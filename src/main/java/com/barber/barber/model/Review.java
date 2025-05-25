package com.barber.barber.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="review")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String phone;
    private String date;
    private String userReview;
}
