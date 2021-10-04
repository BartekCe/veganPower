package com.bartekce.veganpower.training.strategy;

import com.bartekce.veganpower.exercise.Exercise;
import com.bartekce.veganpower.training.TrainingUnit;
import com.bartekce.veganpower.training.TrainingUnitService;

import java.util.List;

public class TrainingStrategy_41_to_45 extends AbstractTrainingPopulatingStrategy{
    public TrainingStrategy_41_to_45() {
        super(TrainingStrategy.TRAINING_FOR_41_TO_45);
    }

    @Override
    public List<TrainingUnit> populateTraining(TrainingUnitService trainingUnitService) {
        return trainingUnitService.saveAll(List.of(
                new TrainingUnit(PLANNED, 60, List.of(new Exercise(List.of(27, 29, 25, 25, 35)))),
                new TrainingUnit(PLANNED, 45, List.of(new Exercise(List.of(19, 19, 22, 22, 18, 18, 22, 35)))),
                new TrainingUnit(PLANNED, 45, List.of(new Exercise(List.of(20, 20, 24, 24, 20, 20, 22, 40))))));
    }
}
