package com.tutorbot.controller;

import com.tutorbot.model.Student;
import com.tutorbot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * StudentController - REST API endpoints for students
 * Base path: /api/students
 */
@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentService studentService;
    // Method: getAllStudents()
    // Returns: ResponseEntity with list of all students and HTTP 200 OK
    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents() {
        return ResponseEntity.ok(studentService.getAllStudents());
    }
    // Method: getStudentById(int id)
    // Returns: ResponseEntity with student if found (HTTP 200), or 404 if not found
    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable int id) {
        Student student = studentService.getStudentById(id);
        if (student == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.ok(student);
    }
    // Method: registerStudent(Student student)
    // Request body: Student object (JSON)
    // Returns: ResponseEntity with newly registered student and HTTP 201 CREATED
    @PostMapping
    public ResponseEntity<Student> registerStudent(@RequestBody Student student) {
        Student createdStudent = studentService.registerStudent(student);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdStudent);
    }
}
