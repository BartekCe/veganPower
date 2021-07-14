package com.bartekce.veganpower.controller;

import com.bartekce.veganpower.entity.Exercise;
import com.bartekce.veganpower.service.ExerciseService;
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

    @GetMapping(path = "/exercise/{name}")
    public Exercise findExerciseByName(@PathVariable String name) {
        return exerciseService.getExerciseByName(name);
    }

    @GetMapping(path = "/exercises")
    public List<Exercise> findAllExercises() {
        return exerciseService.getExercises();
    }

}
