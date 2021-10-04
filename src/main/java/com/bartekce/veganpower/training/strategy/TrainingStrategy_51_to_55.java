package com.bartekce.veganpower.training.strategy;

import com.bartekce.veganpower.exercise.Exercise;
import com.bartekce.veganpower.training.TrainingUnit;
import com.bartekce.veganpower.training.TrainingUnitService;

import java.util.List;

public class TrainingStrategy_51_to_55 extends AbstractTrainingPopulatingStrategy {
    public TrainingStrategy_51_to_55() {
        super(TrainingStrategy.TRAINING_FOR_51_TO_55);
    }

    @Override
    public List<TrainingUnit> populateTraining(TrainingUnitService trainingUnitService) {
        return trainingUnitService.saveAll(List.of(
                new TrainingUnit(60, List.of(new Exercise(List.of(30, 39, 35, 35, 42)))),
                new TrainingUnit(45, List.of(new Exercise(List.of(20, 20, 23, 23, 20, 20, 18, 18, 53)))),
                new TrainingUnit(45, List.of(new Exercise(List.of(22, 22, 30, 30, 25, 25, 18, 18, 55))))));
    }
}
