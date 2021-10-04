package com.bartekce.veganpower.training.strategy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public enum TrainingStrategy {
    TRAINING_FOR_OVER_60(IntStream.rangeClosed(60, 200)
            .boxed().collect(Collectors.toList())),
    TRAINING_FOR_56_TO_59(IntStream.rangeClosed(56, 59)
            .boxed().collect(Collectors.toList())),
    TRAINING_FOR_51_TO_55(IntStream.rangeClosed(51, 55)
            .boxed().collect(Collectors.toList())),
    TRAINING_FOR_46_TO_50(IntStream.rangeClosed(46, 50)
            .boxed().collect(Collectors.toList())),
    TRAINING_FOR_41_TO_45(IntStream.rangeClosed(41, 45)
            .boxed().collect(Collectors.toList())),
    TRAINING_FOR_36_TO_40(IntStream.rangeClosed(36, 40)
            .boxed().collect(Collectors.toList())),
    TRAINING_FOR_31_TO_35(IntStream.rangeClosed(31, 35)
            .boxed().collect(Collectors.toList())),
    TRAINING_FOR_26_TO_30(IntStream.rangeClosed(26, 30)
            .boxed().collect(Collectors.toList())),
    TRAINING_FOR_21_TO_25(IntStream.rangeClosed(21, 25)
            .boxed().collect(Collectors.toList())),
    TRAINING_FOR_11_TO_20(IntStream.rangeClosed(11, 20)
            .boxed().collect(Collectors.toList())),
    TRAINING_FOR_6_TO_10(IntStream.rangeClosed(1, 10)
            .boxed().collect(Collectors.toList()));

    private final List<Integer> reps;

    TrainingStrategy(List<Integer> reps) {
        this.reps = reps;
    }

    public static TrainingStrategy method(int maxPushUps) {
        return Arrays.stream(values()).filter(ts -> ts.reps.contains(maxPushUps))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("There is no strategy for that amount: `" + maxPushUps + "of pushaps"));
    }
}