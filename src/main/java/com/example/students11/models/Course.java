package com.example.students11.models;


import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)


@Entity
@Table(name = "courses")
public class Course {

    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String title;
    double price;
    String duration;



}
