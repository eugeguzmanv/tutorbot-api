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
 * TODO: Inject StudentService using @Autowired
 * TODO: Implement GET /api/students - List all students
 * TODO: Implement GET /api/students/{id} - Get student by id
 * TODO: Implement POST /api/students - Register new student
 */
@RestController
@RequestMapping("/api/students")
public class StudentController {

    // TODO: Declare StudentService and inject it using @Autowired
    // @Autowired
    // private StudentService studentService;

    // TODO: Create GET /api/students endpoint
    // Method: getAllStudents()
    // Returns: ResponseEntity with list of all students and HTTP 200 OK
    public ResponseEntity<List<Student>> getAllStudents() {
        // TODO: Call studentService.getAllStudents() and return ResponseEntity
        return null;
    }

    // TODO: Create GET /api/students/{id} endpoint
    // Method: getStudentById(int id)
    // Returns: ResponseEntity with student if found (HTTP 200), or 404 if not found
    public ResponseEntity<Student> getStudentById(@PathVariable int id) {
        // TODO: Call studentService.getStudentById(id)
        // TODO: Return 200 OK with student if not null
        // TODO: Return 404 NOT FOUND if student is null
        return null;
    }

    // TODO: Create POST /api/students endpoint
    // Method: registerStudent(Student student)
    // Request body: Student object (JSON)
    // Returns: ResponseEntity with newly registered student and HTTP 201 CREATED
    public ResponseEntity<Student> registerStudent(@RequestBody Student student) {
        // TODO: Call studentService.registerStudent(student)
        // TODO: Return ResponseEntity with HTTP 201 CREATED status
        return null;
    }
}
