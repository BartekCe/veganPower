package com.bartekce.veganpower.trainingUnit;

import com.bartekce.veganpower.exercises.Exercise;

import java.time.LocalDate;
import java.util.List;

public class TrainingUnit {

    private final Long id;
    private List<Exercise> exercises;

    private final int sets;
    private final LocalDate dateOfTraining;

    public TrainingUnit(Long id, List<Exercise> exercises, int sets, LocalDate dateOfTraining) {
        this.id = id;
        this.exercises = exercises;
        this.sets = sets;
        this.dateOfTraining = dateOfTraining;
    }

    public Long getId() {
        return id;
    }

    public List<Exercise> getExercises() {
        return exercises;
    }

    public void setExercises(List<Exercise> exercises) {
        this.exercises = exercises;
    }


    public LocalDate getDateOfTraining() {
        return dateOfTraining;
    }

    @Override
    public String toString() {
        return "TrainingUnit{" +
                "id=" + id +
                ", exercises=" + exercises +
                ", sets=" + sets +
                ", date=" + dateOfTraining +
                '}';
    }
}
