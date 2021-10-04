package com.bartekce.veganpower.training.strategy;

import com.bartekce.veganpower.exercise.Exercise;
import com.bartekce.veganpower.training.TrainingUnit;
import com.bartekce.veganpower.training.TrainingUnitService;

import java.util.List;

public class TrainingStrategy_36_to_40 extends AbstractTrainingPopulatingStrategy{
    public TrainingStrategy_36_to_40() {
        super(TrainingStrategy.TRAINING_FOR_36_TO_40);
    }

    @Override
    public List<TrainingUnit> populateTraining(TrainingUnitService trainingUnitService) {
        return trainingUnitService.saveAll(List.of(
                new TrainingUnit(PLANNED, 60, List.of(new Exercise(List.of(22, 24, 20, 20, 25)))),
                new TrainingUnit(PLANNED, 45, List.of(new Exercise(List.of(15, 15, 18, 18, 15, 15, 14, 30)))),
                new TrainingUnit(PLANNED, 45, List.of(new Exercise(List.of(18, 18, 20, 20, 17, 17, 15, 35))))));
    }
}
