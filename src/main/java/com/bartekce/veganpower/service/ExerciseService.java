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

    public List<Exercise> saveExercises(List<Exercise> exercises) {
        return exerciseRepository.saveAll(exercises);
    }

    public List<Exercise> getExercises() {
        return exerciseRepository.findAll();
    }

    public List<Exercise> getExerciseByName(String name) {
        return exerciseRepository.findAllByName(name);
    }


}
