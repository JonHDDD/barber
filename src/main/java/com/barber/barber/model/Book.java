package com.barber.barber.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="book")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String phone;
    private String email;
    private String service;
    private String date;
    private String time;
    private String barber;
}
