package com.example.Student.Management.System.Service.Impl;

import com.example.Student.Management.System.Entity.Student;

import java.util.List;

// Service interface for managing students
public interface StudentService {

    // Get all students
    List<Student> getAllStudents();

    // Save a new student
    Student saveStudent(Student student);

    // Update an existing student
    Student updateStudent(Student student);

    // Get a student by ID
    Student getStudentById(Long id);

    // Delete a student by ID
    void deleteStudentById(Long id);
}