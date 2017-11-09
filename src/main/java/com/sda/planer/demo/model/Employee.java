package com.sda.planer.demo.model;


import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;


@NoArgsConstructor
@Data
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;

    private String firstName;

    private String lastName;

    private String phoneNumber;

    private String email;

    @Enumerated(EnumType.STRING)
    private EmployeeEnum departmen;
}