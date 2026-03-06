package com.tutorbot.service;

import com.tutorbot.model.Exercise;
import com.tutorbot.model.Feedback;
import com.tutorbot.repository.ExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * ExerciseService - Business logic for exercises and feedback
 * TODO: Inject ExerciseRepository using @Autowired
 * TODO: Implement getAllExercises() - returns all exercises
 * TODO: Implement getExercisesByDifficulty(String difficulty) - filters by difficulty
 * TODO: Implement submitAnswer(int studentId, int exerciseId, String answer) - returns Feedback
 */
@Service
public class ExerciseService {

    // TODO: Declare ExerciseRepository and inject it using @Autowired
    // @Autowired
    // private ExerciseRepository exerciseRepository;

    // TODO: Implement getAllExercises() method
    // Returns list of all exercises from repository
    public List<Exercise> getAllExercises() {
        // TODO: Call exerciseRepository.findAll() and return result
        return null;
    }

    // TODO: Implement getExercisesByDifficulty(String difficulty) method
    // Returns filtered list of exercises by difficulty level
    public List<Exercise> getExercisesByDifficulty(String difficulty) {
        // TODO: Call exerciseRepository.findByDifficulty(difficulty) and return result
        return null;
    }

    // TODO: Implement submitAnswer(int studentId, int exerciseId, String answer) method
    // Returns Feedback object with score and message
    // Logic:
    //   - Get correct answer from exerciseRepository
    //   - Compare with submitted answer
    //   - If match: score = 100, message = "Excellent! That is correct.", correct = true
    //   - If no match: score = 40, message = "Try again!", correct = false
    public Feedback submitAnswer(int studentId, int exerciseId, String answer) {
        // TODO: Get exercise to verify it exists
        // TODO: Get correct answer from repository
        // TODO: Compare answer with correct answer
        // TODO: Create and return Feedback object with appropriate score and message
        return null;
    }
}
