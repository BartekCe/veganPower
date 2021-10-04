package com.bartekce.veganpower.training.strategy;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class StrategiesList {
    private final List<TrainingPopulatingStrategy> strategies = new ArrayList<>();

    public StrategiesList(){
        addStrategies();
    }

    private void addStrategies() {
        this.strategies.add(new TrainingStrategyOver_60());
        this.strategies.add(new TrainingStrategy_56_to_59());
        this.strategies.add(new TrainingStrategy_51_to_55());
        this.strategies.add(new TrainingStrategy_46_to_50());
        this.strategies.add(new TrainingStrategy_41_to_45());
        this.strategies.add(new TrainingStrategy_36_to_40());
        this.strategies.add(new TrainingStrategy_31_to_35());
        this.strategies.add(new TrainingStrategy_26_to_30());
        this.strategies.add(new TrainingStrategy_21_to_25());
        this.strategies.add(new TrainingStrategy_11_to_20());
        this.strategies.add(new TrainingStrategy_6_to_10());
    }
}
