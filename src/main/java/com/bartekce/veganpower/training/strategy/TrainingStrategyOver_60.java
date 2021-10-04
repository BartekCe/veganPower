package com.bartekce.veganpower.training.strategy;

import com.bartekce.veganpower.exercise.Exercise;
import com.bartekce.veganpower.training.TrainingUnit;
import com.bartekce.veganpower.training.TrainingUnitService;

import java.util.List;

public class TrainingStrategyOver_60 extends AbstractTrainingPopulatingStrategy {


    public TrainingStrategyOver_60() {
        super(TrainingStrategy.TRAINING_FOR_OVER_60);
    }

    @Override
    public List<TrainingUnit> populateTraining(TrainingUnitService trainingUnitService) {
        return trainingUnitService.saveAll(List.of(
                new TrainingUnit(60, List.of(new Exercise(List.of(35, 49, 45, 45, 55)))),
                new TrainingUnit(45, List.of(new Exercise(List.of(22, 22, 30, 30, 24, 24, 18, 18, 59)))),
                new TrainingUnit(45, List.of(new Exercise(List.of(28, 28, 35, 35, 27, 27, 23, 23, 60))))));
    }
}
