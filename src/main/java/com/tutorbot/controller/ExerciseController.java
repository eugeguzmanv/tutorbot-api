package com.tutorbot.controller;

import com.tutorbot.model.Exercise;
import com.tutorbot.model.Feedback;
import com.tutorbot.service.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * ExerciseController - REST API endpoints for exercises and feedback
 * Base path: /api/exercises
 * TODO: Inject ExerciseService using @Autowired
 * TODO: Implement GET /api/exercises - List all exercises
 * TODO: Implement GET /api/exercises?difficulty=X - Filter by difficulty
 * TODO: Implement POST /api/exercises/submit - Submit answer and get feedback
 */
@RestController
@RequestMapping("/api/exercises")
public class ExerciseController {

    // TODO: Declare ExerciseService and inject it using @Autowired
    // @Autowired
    // private ExerciseService exerciseService;

    // TODO: Create GET /api/exercises endpoint
    // Method: getAllExercises()
    // Query param (optional): difficulty - filters exercises by difficulty level
    // Returns: ResponseEntity with list of exercises and HTTP 200 OK
    public ResponseEntity<List<Exercise>> getAllExercises(@RequestParam(required = false) String difficulty) {
        // TODO: If difficulty parameter is provided, call exerciseService.getExercisesByDifficulty(difficulty)
        // TODO: If no difficulty parameter, call exerciseService.getAllExercises()
        // TODO: Return ResponseEntity with list and HTTP 200 OK
        return null;
    }

    // TODO: Create POST /api/exercises/submit endpoint
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
        // TODO: Extract studentId, exerciseId, answer from submission
        // TODO: Call exerciseService.submitAnswer(studentId, exerciseId, answer)
        // TODO: Return ResponseEntity with Feedback and HTTP 200 OK
        return null;
    }
}
