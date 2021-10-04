package com.bartekce.veganpower.training.strategy;

import com.bartekce.veganpower.exercise.Exercise;
import com.bartekce.veganpower.training.TrainingUnit;
import com.bartekce.veganpower.training.TrainingUnitService;

import java.util.List;

public class TrainingStrategy_6_to_10 extends AbstractTrainingPopulatingStrategy {
    public TrainingStrategy_6_to_10() {
        super(TrainingStrategy.TRAINING_FOR_6_TO_10);
    }

    @Override
    public List<TrainingUnit> populateTraining(TrainingUnitService trainingUnitService) {
        return trainingUnitService.saveAll(List.of(
                new TrainingUnit(60, List.of(new Exercise(List.of(5, 6, 4, 4, 5)))),
                new TrainingUnit(90, List.of(new Exercise(List.of(6, 7, 6, 6, 7)))),
                new TrainingUnit(120, List.of(new Exercise(List.of(8, 10, 7, 7, 10)))),
                new TrainingUnit(60, List.of(new Exercise(List.of(9, 11, 8, 8, 11)))),
                new TrainingUnit(90, List.of(new Exercise(List.of(10, 12, 9, 9, 13)))),
                new TrainingUnit(120, List.of(new Exercise(List.of(12, 13, 10, 10, 15))))));
    }
}
