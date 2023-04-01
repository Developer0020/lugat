package com.example.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "psw")
    private String psw;
    @Column(name = "phone")
    private String phone;
    @Column(name = "created_date")
    private LocalDate created_date;
    @Column(name = "visible")
    private Boolean visible;
}
