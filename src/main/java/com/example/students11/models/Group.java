package com.example.students11.models;


import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.yaml.snakeyaml.events.Event;

import javax.persistence.*;
import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)

@Entity
@Table(name = "groups")
public class Group {

    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    Date startDate;
    Date endDate;

    @ManyToOne
            @JoinColumn(name = "courses_id")
    Course course;
    @ManyToOne
            @JoinColumn(name = "teachers_id")
    Teacher teacher;



}
