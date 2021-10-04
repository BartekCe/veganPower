package com.bartekce.veganpower.training.strategy;

import com.bartekce.veganpower.exercise.Exercise;
import com.bartekce.veganpower.training.TrainingUnit;
import com.bartekce.veganpower.training.TrainingUnitService;

import java.util.List;

public class TrainingStrategy_56_to_59 extends AbstractTrainingPopulatingStrategy{
    public TrainingStrategy_56_to_59() {
        super(TrainingStrategy.TRAINING_FOR_56_TO_59);
    }

    @Override
    public List<TrainingUnit> populateTraining(TrainingUnitService trainingUnitService) {
        return trainingUnitService.saveAll(List.of(
                new TrainingUnit(PLANNED, 60, List.of(new Exercise(List.of(30, 44, 40, 40, 55)))),
                new TrainingUnit(PLANNED, 45, List.of(new Exercise(List.of(22, 22, 27, 27, 24, 23, 18, 18, 58)))),
                new TrainingUnit(PLANNED, 45, List.of(new Exercise(List.of(26, 26, 33, 33, 26, 26, 22, 22, 60))))));
    }
}
