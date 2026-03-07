package com.tutorbot.service;

import com.tutorbot.model.Student;
import com.tutorbot.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * StudentService - Business logic for students
 */
@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    // Returns list of all students from repository
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // Returns single student by id, or null if not found
    public Student getStudentById(int id) {
        return studentRepository.findById(id);
    }

    // Adds new student to repository with auto-assigned id
    public Student registerStudent(Student student) {
        return studentRepository.save(student);
    }
}
