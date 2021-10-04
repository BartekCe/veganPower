package com.bartekce.veganpower.training.strategy;

import com.bartekce.veganpower.exercise.Exercise;
import com.bartekce.veganpower.training.TrainingUnit;
import com.bartekce.veganpower.training.TrainingUnitService;

import java.util.List;

public class TrainingStrategy_21_to_25 extends AbstractTrainingPopulatingStrategy {
    public TrainingStrategy_21_to_25() {
        super(TrainingStrategy.TRAINING_FOR_21_TO_25);
    }

    @Override
    public List<TrainingUnit> populateTraining(TrainingUnitService trainingUnitService) {
        return trainingUnitService.saveAll(List.of(
                new TrainingUnit(60, List.of(new Exercise(List.of(12, 17, 13, 13, 17)))),
                new TrainingUnit(90, List.of(new Exercise(List.of(14, 19, 14, 14, 19)))),
                new TrainingUnit(120, List.of(new Exercise(List.of(16, 21, 15, 15, 21)))),
                new TrainingUnit(60, List.of(new Exercise(List.of(18, 22, 16, 16, 21)))),
                new TrainingUnit(90, List.of(new Exercise(List.of(20, 25, 20, 20, 23)))),
                new TrainingUnit(120, List.of(new Exercise(List.of(23, 28, 22, 22, 25))))));
    }
}
