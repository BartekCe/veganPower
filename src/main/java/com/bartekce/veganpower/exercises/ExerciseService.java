package com.bartekce.veganpower.exercises;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExerciseService {

    Exercise pullUp = new Exercise("Pull-up", 1, 6);
    Exercise pushUp = new Exercise("Push-up", 1, 12);
    Exercise oneLegDeadLift = new Exercise("One leg deadlift", 38, 6);
    Exercise dumbbellBenchPress = new Exercise("dumbbell bench press", 32, 18);
    Exercise bulgarianSquat = new Exercise("Bulgarian squat", 32, 7);
    Exercise overheadDumbbellPress = new Exercise("Overhead dumbbell press", 16, 7);
    Exercise dumbbellRow = new Exercise("dumbbell row", 22, 11);
    Exercise hangingKneeUps = new Exercise("Hanging knee-ups", 1, 8);

    public List<Exercise> getExercises() {
        return List.of(
                pullUp,
                pushUp,
                oneLegDeadLift,
                dumbbellBenchPress,
                bulgarianSquat,
                overheadDumbbellPress,
                dumbbellRow,
                hangingKneeUps
        );
    }
}
