# TutorBot API

A Spring Boot REST API for managing students and exercises with feedback.

## Project Structure

```
tutorbot-api/
├── src/main/java/com/tutorbot/
│   ├── TutorbotApplication.java
│   ├── controller/
│   │   ├── StudentController.java
│   │   └── ExerciseController.java
│   ├── service/
│   │   ├── StudentService.java
│   │   └── ExerciseService.java
│   ├── model/
│   │   ├── Student.java
│   │   ├── Exercise.java
│   │   └── Feedback.java
│   └── repository/
│       ├── StudentRepository.java
│       └── ExerciseRepository.java
└── src/main/resources/
    └── application.properties
```

## Requirements

- Java 11 or higher
- Maven 3.6.0 or higher
- Spring Boot 2.7.x or higher

## How to Run

1. **Clone or navigate to the project directory:**
   ```bash
   cd tutorbot-api
   ```

2. **Build the project:**
   ```bash
   mvn clean install
   ```

3. **Run the application:**
   ```bash
   mvn spring-boot:run
   ```

   Or run the JAR file:
   ```bash
   java -jar target/tutorbot-api-0.0.1-SNAPSHOT.jar
   ```

4. **Verify the application is running:**
   - The server should start on `http://localhost:8080`
   - Check logs for any errors

## API Endpoints

### Student Endpoints
- **GET** `/api/students` - Get all students
- **GET** `/api/students/{id}` - Get student by ID
- **POST** `/api/students` - Register a new student

### Exercise Endpoints
- **GET** `/api/exercises` - Get all exercises
- **GET** `/api/exercises?difficulty=easy` - Filter exercises by difficulty
- **POST** `/api/exercises/submit` - Submit an answer and receive feedback

## Testing with Postman

### 1. Get All Students
- **Method:** GET
- **URL:** `http://localhost:8080/api/students`
- **Expected Response:** List of all students

### 2. Get Student by ID
- **Method:** GET
- **URL:** `http://localhost:8080/api/students/1`
- **Expected Response:** Single student object

### 3. Register New Student
- **Method:** POST
- **URL:** `http://localhost:8080/api/students`
- **Body (JSON):**
  ```json
  {
    "name": "John Doe",
    "email": "john@university.com",
    "level": "intermediate"
  }
  ```
- **Expected Response:** Newly created student with auto-assigned ID

### 4. Get All Exercises
- **Method:** GET
- **URL:** `http://localhost:8080/api/exercises`
- **Expected Response:** List of all exercises

### 5. Get Exercises by Difficulty
- **Method:** GET
- **URL:** `http://localhost:8080/api/exercises?difficulty=easy`
- **Expected Response:** Filtered list of exercises

### 6. Submit Answer
- **Method:** POST
- **URL:** `http://localhost:8080/api/exercises/submit`
- **Body (JSON):**
  ```json
  {
    "studentId": 1,
    "exerciseId": 101,
    "answer": "@RestController"
  }
  ```
- **Expected Response:** Feedback object with score and message

## Fake Data

The application comes pre-loaded with:
- **3+ Students** with IDs, names, emails, and levels
- **4+ Exercises** with topics, questions, and difficulty levels

## Notes

- All data is stored in memory using ArrayList (no database)
- Student IDs are auto-assigned when registering
- Exercise answers are hardcoded for verification
- Scores: 100 for correct answers, 40 for incorrect

## TODO Checklist

- [ ] Implement all model classes with getters/setters/constructors
- [ ] Pre-load fake data in repositories
- [ ] Implement repository methods
- [ ] Implement service methods with business logic
- [ ] Implement REST controller methods
- [ ] Test all 7 endpoints with Postman
- [ ] Verify server runs on port 8080
- [ ] Check JSON responses are properly formatted

## Author

Created as part of TutorBot API project
