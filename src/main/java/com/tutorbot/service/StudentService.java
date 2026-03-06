package com.tutorbot.service;

import com.tutorbot.model.Student;
import com.tutorbot.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * StudentService - Business logic for students
 * TODO: Inject StudentRepository using @Autowired
 * TODO: Implement getAllStudents() - returns all students
 * TODO: Implement getStudentById(int id) - returns one student or null
 * TODO: Implement registerStudent(Student s) - adds to list, auto-assigns id
 */
@Service
public class StudentService {

    // TODO: Declare StudentRepository and inject it using @Autowired
    // @Autowired
    // private StudentRepository studentRepository;

    // TODO: Implement getAllStudents() method
    // Returns list of all students from repository
    public List<Student> getAllStudents() {
        // TODO: Call studentRepository.findAll() and return result
        return null;
    }

    // TODO: Implement getStudentById(int id) method
    // Returns single student by id, or null if not found
    public Student getStudentById(int id) {
        // TODO: Call studentRepository.findById(id) and return result
        return null;
    }

    // TODO: Implement registerStudent(Student student) method
    // Adds new student to repository with auto-assigned id
    public Student registerStudent(Student student) {
        // TODO: Call studentRepository.save(student) and return result
        return null;
    }
}
