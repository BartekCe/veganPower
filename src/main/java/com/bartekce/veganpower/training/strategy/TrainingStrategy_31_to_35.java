package com.bartekce.veganpower.training.strategy;

import com.bartekce.veganpower.exercise.Exercise;
import com.bartekce.veganpower.training.TrainingUnit;
import com.bartekce.veganpower.training.TrainingUnitService;

import java.util.List;

public class TrainingStrategy_31_to_35 extends AbstractTrainingPopulatingStrategy{
    public TrainingStrategy_31_to_35() {
        super(TrainingStrategy.TRAINING_FOR_31_TO_35);
    }

    @Override
    public List<TrainingUnit> populateTraining(TrainingUnitService trainingUnitService) {
        return trainingUnitService.saveAll(List.of(
                new TrainingUnit(PLANNED, 60, List.of(new Exercise(List.of(17, 19, 15, 15, 20)))),
                new TrainingUnit(PLANNED, 45, List.of(new Exercise(List.of(10, 10, 13, 13, 10, 10, 9, 25)))),
                new TrainingUnit(PLANNED, 45, List.of(new Exercise(List.of(13, 13, 15, 15, 12, 12, 10, 30))))));
    }
}
