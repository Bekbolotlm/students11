package com.example.students11.models;


import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)


@Entity
@Table(name = "payments")
public class Payment {

    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Date paymentDate;

    @ManyToOne
            @JoinColumn(name = "students_id")
    Student student;
    @ManyToOne
            @JoinColumn(name = "groups_id")
    Group group;

    @Enumerated(value = EnumType.STRING)
    PaymentStatus status;
}
