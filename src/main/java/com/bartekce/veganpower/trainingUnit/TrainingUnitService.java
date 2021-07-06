package com.bartekce.veganpower.trainingUnit;

import com.bartekce.veganpower.exercises.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class TrainingUnitService {

    private final ExerciseService exerciseService;

    @Autowired
    public TrainingUnitService(ExerciseService exerciseService) {
        this.exerciseService = exerciseService;
    }

    public List<TrainingUnit> getTrainingUnits(){
        return List.of(
                new TrainingUnit(
                        1L,
                        exerciseService.getExercises(),
                        2,
                        LocalDate.of(2021,7,4)
                )
        );
    }
}

