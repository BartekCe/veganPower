package com.bartekce.veganpower.training;

import com.bartekce.veganpower.exercise.Exercise;
import lombok.Getter;

import java.time.LocalDate;
import java.util.List;

@Getter
public class TrainingDto {
    private Long cycleId;
    private Long id;
    private TrainingStatus trainingStatus;
    private LocalDate dateOfTraining;
    private int breakTime;
    private List<Exercise> exercises;
}
