package org.backendStudents.model;

import jakarta.persistence.*;

import javax.annotation.processing.Generated;

@Entity
@Table(name ="student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String fullName;
    private int age;
    private String studentId;




}
