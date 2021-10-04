package com.bartekce.veganpower.training.strategy;

import com.bartekce.veganpower.training.TrainingUnit;
import com.bartekce.veganpower.training.TrainingUnitService;

import java.util.List;

public interface TrainingPopulatingStrategy {
    List<TrainingUnit> populateTraining(TrainingUnitService trainingUnitService);
    boolean shouldPopulate(TrainingStrategy trainingStrategy);
}
