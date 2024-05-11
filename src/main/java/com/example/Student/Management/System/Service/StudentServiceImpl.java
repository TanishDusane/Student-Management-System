package com.example.Student.Management.System.Service;

import com.example.Student.Management.System.Entity.Student;
import com.example.Student.Management.System.Repository.StudentRepository;
import com.example.Student.Management.System.Service.Impl.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

// Service implementation class for managing students
@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    // Get all students
    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // Save a new student
    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    // Update an existing student
    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    // Get a student by ID
    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    // Delete a student by ID
    @Override
    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }
}