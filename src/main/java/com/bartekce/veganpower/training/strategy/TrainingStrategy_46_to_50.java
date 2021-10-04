package com.bartekce.veganpower.training.strategy;

import com.bartekce.veganpower.exercise.Exercise;
import com.bartekce.veganpower.training.TrainingUnit;
import com.bartekce.veganpower.training.TrainingUnitService;

import java.util.List;

public class TrainingStrategy_46_to_50 extends AbstractTrainingPopulatingStrategy {
    public TrainingStrategy_46_to_50() {
        super(TrainingStrategy.TRAINING_FOR_46_TO_50);
    }

    @Override
    public List<TrainingUnit> populateTraining(TrainingUnitService trainingUnitService) {
        return trainingUnitService.saveAll(List.of(
                new TrainingUnit(60, List.of(new Exercise(List.of(30, 34, 30, 30, 40)))),
                new TrainingUnit(45, List.of(new Exercise(List.of(19, 19, 23, 23, 19, 19, 22, 37)))),
                new TrainingUnit(45, List.of(new Exercise(List.of(20, 20, 27, 27, 21, 21, 21, 44))))));
    }
}
