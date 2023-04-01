package com.example.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Entity
@Getter
@Setter
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "title")
    private String title;
    @Column(name = "author")
    private String author;
    @Column(name = "publish_year")
    private LocalDate publish_year;
    @Column(name = "amount")
    private Integer amount;
    @Column(name = "visible")
    private Boolean visible;
}
