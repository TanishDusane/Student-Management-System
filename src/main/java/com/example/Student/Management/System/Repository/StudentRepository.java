package com.example.Student.Management.System.Repository;

import com.example.Student.Management.System.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Repository interface for Student entity
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}