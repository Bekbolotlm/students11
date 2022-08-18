package com.example.students11.models;


import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)


@Entity
@Table(name = "student_groups")
public class StudentGroup {

    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Date startDate;
    Date endDate;
    String status;
    @ManyToOne
            @JoinColumn(name = "students_id")
    Student student;
    @ManyToOne
            @JoinColumn(name = "groups_id")
    Group group;

}
