package com.bartekce.veganpower.exercise;

import com.bartekce.veganpower.exercise.Exercise;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class ExerciseStats {
    int allReps;
    int allSets;
    int allTrainings;
    int averageRepsForSet;

    public ExerciseStats(List<Exercise> exercises) {
        this.allReps = 0;
        this.allSets = 0;
        addRepsAndSets(exercises);
        this.allTrainings = exercises.size();
        this.averageRepsForSet = this.allReps / this.allSets;
    }

    private void addRepsAndSets(List<Exercise> exercises) {
        exercises.forEach(e -> {
            this.allSets = this.allSets + e.getReps().size();
            this.allReps = this.allReps +
                    e.getReps().stream().mapToInt(set -> set).sum();
        });
    }

    @Override
    public String toString() {
        return "ExerciseStats{" +
                "allReps=" + allReps +
                ", allSets=" + allSets +
                '}';
    }
}
