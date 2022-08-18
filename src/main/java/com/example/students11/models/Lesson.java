package com.example.students11.models;


import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)


@Entity
@Table(name = "lessons")
public class Lesson {

    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String day;

    @ManyToOne
            @JoinColumn(name = "groups_id")
    Group group;

}
