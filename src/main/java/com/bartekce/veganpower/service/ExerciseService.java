package com.bartekce.veganpower.service;

import com.bartekce.veganpower.entity.Exercise;
import com.bartekce.veganpower.repository.ExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExerciseService {

    @Autowired
    private ExerciseRepository exerciseRepository;

    public Exercise saveExercise(Exercise exercise) {
        return exerciseRepository.save(exercise);
    }

    public List<Exercise> saveExercises(List<Exercise> exercises){
        return exerciseRepository.saveAll(exercises);
    }

    public List<Exercise> getExercises(){
        return exerciseRepository.findAll();
    }

    public Exercise getExerciseByName(String name){
        return exerciseRepository.findByName(name);
    }

    public Exercise updateExercise(Exercise exercise){
        Exercise updateExercise = exerciseRepository.findByName(exercise.getName());
        updateExercise.setName(exercise.getName());
        updateExercise.setReps(exercise.getReps());
        updateExercise.setWeight(exercise.getWeight());
        return exerciseRepository.save(updateExercise);
    }



//    private final Exercise pullUp = new Exercise("Pull-up", 1, 6);
//    private final Exercise pushUp = new Exercise("Push-up", 1, 12);
//    private final Exercise oneLegDeadLift = new Exercise("One leg deadLift", 38, 6);
//    private final Exercise dumbbellBenchPress = new Exercise("dumbbell bench press", 32, 18);
//    private final Exercise bulgarianSquat = new Exercise("Bulgarian squat", 32, 7);
//    private final Exercise overheadDumbbellPress = new Exercise("Overhead dumbbell press", 16, 7);
//    private final Exercise dumbbellRow = new Exercise("dumbbell row", 22, 11);
//    private final Exercise hangingKneeUps = new Exercise("Hanging knee-ups", 1, 8);
//
//    public List<Exercise> getExercises() {
//        return List.of(
//                pullUp,
//                pushUp,
//                oneLegDeadLift,
//                dumbbellBenchPress,
//                bulgarianSquat,
//                overheadDumbbellPress,
//                dumbbellRow,
//                hangingKneeUps
//        );
//    }

}
