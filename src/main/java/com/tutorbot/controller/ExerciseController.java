package com.tutorbot.controller;

import com.tutorbot.model.Exercise;
import com.tutorbot.model.Feedback;
import com.tutorbot.service.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * ExerciseController - REST API endpoints for exercises and feedback
 * Base path: /api/exercises
 */
@RestController
@RequestMapping("/api/exercises")
public class ExerciseController {

    @Autowired
    private ExerciseService exerciseService;
    // Method: getAllExercises()
    // Query param (optional): difficulty - filters exercises by difficulty level
    // Returns: ResponseEntity with list of exercises and HTTP 200 OK
    @GetMapping
    public ResponseEntity<List<Exercise>> getAllExercises(@RequestParam(required = false) String difficulty) {
        List<Exercise> exercises;
        if (difficulty != null && !difficulty.isBlank()) {
            exercises = exerciseService.getExercisesByDifficulty(difficulty);
        } else {
            exercises = exerciseService.getAllExercises();
        }
        return ResponseEntity.ok(exercises);
    }
    // Method: submitAnswer(Feedback submission)
    // Request body JSON example:
    // {
    //   "studentId": 1,
    //   "exerciseId": 101,
    //   "answer": "@RestController"
    // }
    // Returns: ResponseEntity with Feedback object and HTTP 200 OK
    @PostMapping("/submit")
    public ResponseEntity<Feedback> submitAnswer(@RequestBody Feedback submission) {
        int studentId = submission.getStudentId();
        int exerciseId = submission.getExerciseId();
        String answer = submission.getAnswer();

        Feedback feedback = exerciseService.submitAnswer(studentId, exerciseId, answer);
        return ResponseEntity.ok(feedback);
    }
}
