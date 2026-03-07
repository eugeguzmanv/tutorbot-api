package com.tutorbot.service;

import com.tutorbot.model.Exercise;
import com.tutorbot.model.Feedback;
import com.tutorbot.repository.ExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/*
 * ExerciseService - Business logic for exercises and feedback
 */
@Service
public class ExerciseService {
    @Autowired
    private ExerciseRepository exerciseRepository;

    // Returns list of all exercises from repository
    public List<Exercise> getAllExercises() {
        return exerciseRepository.findAll();
    }

    // Returns filtered list of exercises by difficulty level
    public List<Exercise> getExercisesByDifficulty(String difficulty) {
        return exerciseRepository.findByDifficulty(difficulty);
    }

    // Returns Feedback object with score and message
    public Feedback submitAnswer(int studentId, int exerciseId, String answer) {
        // Get exercise to verify it exists
        if (exerciseRepository.findById(exerciseId) != null) {
            // Get correct answer from repository
            String correctAnswer = exerciseRepository.getCorrectAnswer(exerciseId);

            // Compare answer provided with correct answer
            if (correctAnswer != null && correctAnswer.equals(answer)) {
                return new Feedback(studentId, exerciseId, answer, 100, "Excellent! Your answer is correct.", true);
            }
            else {
                return new Feedback(studentId, exerciseId, answer, 40, "Try again! Your answer is incorrect.", false);
            }
        }

        return new Feedback(studentId, exerciseId, answer, 0, "Exercise not found.", false);
    }
}
