package com.bartekce.veganpower.training.strategy;

import com.bartekce.veganpower.training.TrainingStatus;
import com.bartekce.veganpower.training.TrainingUnit;
import com.bartekce.veganpower.training.TrainingUnitService;

import java.util.List;

public abstract class AbstractTrainingPopulatingStrategy implements TrainingPopulatingStrategy {
    private final TrainingStrategy handledTrainingStrategy;

    protected AbstractTrainingPopulatingStrategy(TrainingStrategy handledTrainingStrategy) {
        this.handledTrainingStrategy = handledTrainingStrategy;
    }

    @Override
    public List<TrainingUnit> populateTraining(TrainingUnitService trainingUnitService) {
        return List.of();
    }

    @Override
    public boolean shouldPopulate(TrainingStrategy trainingStrategy) {
        return trainingStrategy==handledTrainingStrategy;
    }
}
