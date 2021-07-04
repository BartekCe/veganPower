package com.bartekce.veganpower.exercises;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class ExerciseService {

    Exercise exercise_1 = new Exercise("Pull-up", 1);
    Exercise exercise_2 = new Exercise("Push-up", 1);
    Exercise exercise_3 = new Exercise("One leg deadlift", 38);
    Exercise exercise_4 = new Exercise("dumbbell bench press", 32);
    Exercise exercise_5 = new Exercise("Bulgarian squat", 32);
    Exercise exercise_6 = new Exercise("Overhead dumbbell press", 16);
    Exercise exercise_7 = new Exercise("dumbbell row", 22);
    Exercise exercise_8 = new Exercise("Hanging knee-ups", 1);

    public List<Exercise> getExercises() {
        return List.of(
                exercise_1,
                exercise_2,
                exercise_3,
                exercise_4,
                exercise_5,
                exercise_6,
                exercise_7,
                exercise_8
        );
    }
}
