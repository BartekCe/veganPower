package com.bartekce.veganpower.exercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ExerciseController {

    @Autowired
    private ExerciseService exerciseService;

    @PostMapping(path = "/addExercise")
    public Exercise addExercise(@RequestBody Exercise exercise) {
        return exerciseService.saveExercise(exercise);
    }

    @PostMapping(path = "/addExercises")
    public List<Exercise> addExercises(@RequestBody List<Exercise> exercises) {
        return exerciseService.saveExercises(exercises);
    }

    @GetMapping(path = "/exerciseStats/{name}")
    public List<Exercise> findExerciseByName(@PathVariable String name) {
        return exerciseService.getExerciseByName(name);
    }

    @GetMapping(path = "/exercises")
    public List<Exercise> findAllExercises() {
        return exerciseService.getExercises();
    }

    @GetMapping("/stats/{exerciseName}")
    public ExerciseStats getExerciseStats(@PathVariable String exerciseName){
        return exerciseService.getExerciseStats(exerciseName);
    }

}
