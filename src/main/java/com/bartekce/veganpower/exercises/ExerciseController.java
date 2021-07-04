package com.bartekce.veganpower.exercises;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ExerciseController {

private final ExerciseService exerciseService;

    @Autowired
    public ExerciseController(ExerciseService exerciseService) {
        this.exerciseService = exerciseService;
    }


    @GetMapping("/exercises")
    public List<Exercise> getExercises()
    {
        return exerciseService.getExercises();

    }
}