package com.bartekce.veganpower.training.strategy;

import com.bartekce.veganpower.exercise.Exercise;
import com.bartekce.veganpower.training.TrainingUnit;
import com.bartekce.veganpower.training.TrainingUnitService;

import java.util.List;

public class TrainingStrategy_11_to_20 extends AbstractTrainingPopulatingStrategy {
    public TrainingStrategy_11_to_20() {
        super(TrainingStrategy.TRAINING_FOR_11_TO_20);
    }

    @Override
    public List<TrainingUnit> populateTraining(TrainingUnitService trainingUnitService) {
        return trainingUnitService.saveAll(List.of(
                new TrainingUnit(60, List.of(new Exercise(List.of(8, 9, 7, 7, 8)))),
                new TrainingUnit(90, List.of(new Exercise(List.of(9, 10, 8, 8, 10)))),
                new TrainingUnit(120, List.of(new Exercise(List.of(11, 13, 9, 9, 13)))),
                new TrainingUnit(60, List.of(new Exercise(List.of(12, 14, 10, 10, 15)))),
                new TrainingUnit(90, List.of(new Exercise(List.of(13, 15, 11, 11, 17)))),
                new TrainingUnit(120, List.of(new Exercise(List.of(14, 16, 13, 13, 19))))));
    }
}
