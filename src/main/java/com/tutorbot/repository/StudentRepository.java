package com.tutorbot.repository;

import com.tutorbot.model.Student;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

/**
 * StudentRepository - Fake data layer using ArrayList
 */
@Repository
public class StudentRepository {
    // ArrayList<Student> to store students
    private List<Student> students = new ArrayList<>();

    public StudentRepository() {
        // 3 fake students with pre-assigned ids
        students.add(new Student(1, "Ana Torres", "ana@iteso.com", "beginner"));
        students.add(new Student(2, "Juan López", "juan@tec.com.mx", "intermediate"));
        students.add(new Student(3, "Paula", "paula@uaa.com", "advanced"));
    }

    // Returns all students from the list
    public List<Student> findAll() {
        return students;
    }

    // Returns the student with matching id or null if not found
    public Student findById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }

        return null;
    }

    // Adds student to list, auto-assigns id based on size
    public Student save(Student student) {
        int newId = students.size() + 1;
        student.setId(newId);
        students.add(student);
        return student;
    }
}
