package com.example.Student.Management.System.Entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

// Entity class representing a student
@Entity
@Table(name = "students")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Student {

    // Primary key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    // First name of the student
    @Column(nullable = false)
    String firstName;

    // Last name of the student
    @Column(nullable = false)
    String lastName;

    // Unique email of the student
    @Column(unique = true)
    String email;

}