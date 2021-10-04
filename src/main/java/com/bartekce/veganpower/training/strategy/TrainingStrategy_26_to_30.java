package com.bartekce.veganpower.training.strategy;

import com.bartekce.veganpower.exercise.Exercise;
import com.bartekce.veganpower.training.TrainingUnit;
import com.bartekce.veganpower.training.TrainingUnitService;

import java.util.List;

public class TrainingStrategy_26_to_30 extends AbstractTrainingPopulatingStrategy{
    public TrainingStrategy_26_to_30() {
        super(TrainingStrategy.TRAINING_FOR_26_TO_30);
    }

    @Override
    public List<TrainingUnit> populateTraining(TrainingUnitService trainingUnitService) {
        return trainingUnitService.saveAll(List.of(
                new TrainingUnit(PLANNED, 60, List.of(new Exercise(List.of(14, 18, 14, 14, 20)))),
                new TrainingUnit(PLANNED, 90, List.of(new Exercise(List.of(20, 25, 15, 15, 23)))),
                new TrainingUnit(PLANNED, 120, List.of(new Exercise(List.of(20, 27, 18, 18, 25)))),
                new TrainingUnit(PLANNED, 60, List.of(new Exercise(List.of(21, 25, 21, 21, 27)))),
                new TrainingUnit(PLANNED, 90, List.of(new Exercise(List.of(25, 29, 25, 25, 30)))),
                new TrainingUnit(PLANNED, 120, List.of(new Exercise(List.of(29, 33, 29, 29, 33))))));
    }
}
