package com.tutorbot.repository;

import com.tutorbot.model.Exercise;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

/**
 * ExerciseRepository - Fake data layer using ArrayList
 
 */
@Repository
public class ExerciseRepository {

    //Array list to store excercises
    private List<Exercise> exercises = new ArrayList<>();

    public ExerciseRepository() {
        //Examples of exercises
        exercises.add(new Exercise(101, "JAVA", "What is the difference between HashMap and ConcurrentHashMap in Java?", "medium"));
        exercises.add(new Exercise(102, "React", "What problem do React hooks solve compared to class components?", "medium"));
        exercises.add(new Exercise(103, "AI/ML", "Why does adding regularization help reduce overfitting in machine learning models?", "hard"));
        exercises.add(new Exercise(104, "Data Structs. and Algs.", "What is the time complexity of binary search on a sorted array?", "easy"));
    }

    // Returns all exercises from the list
    public List<Exercise> findAll() {
        return exercises;
    }

    // Returns the exercise with matching id or null if not found
    public Exercise findById(int id) {
        for (Exercise exercise : exercises) {
            if (exercise.getId() == id) {
                return exercise;
            }
        }
        return null;
    }

   
    // Filters and returns exercises matching the difficulty level
    public List<Exercise> findByDifficulty(String difficulty) {
        List<Exercise> result= new ArrayList<>();
        for(Exercise exercise: exercises){
            if(exercise.getDifficulty().equalsIgnoreCase(difficulty)){
               result.add(exercise);
            }
        }
        return result;
    }

    // Returns the correct answer for an exercise
    public String getCorrectAnswer(int exerciseId) {
        // Answers for each exc.
        if(exerciseId == 101) return "HashMap is not thread-safe while ConcurrentHashMap supports concurrent access by multiple threads using internal locking mechanisms";
        if(exerciseId == 102) return "React hooks allow functional components to manage state and lifecycle behavior without needing class-based components";
        if(exerciseId == 103) return "Regularization adds a penalty to large model weights in the loss function, discouraging overly complex models that memorize training data";
        if(exerciseId == 104) return "Binary search runs in O(log n) time because it halves the search space on each iteration";
        return null;
    }
}
