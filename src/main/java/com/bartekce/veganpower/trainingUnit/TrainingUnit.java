package com.bartekce.veganpower.trainingUnit;

import com.bartekce.veganpower.exercises.Exercise;

import java.time.LocalDate;
import java.util.List;

public class TrainingUnit {

    private Long id;
    private List<Exercise> exercises;

    private int sets;
    private LocalDate date;




    public TrainingUnit(Long id, List<Exercise> exercises, int sets, LocalDate date) {
        this.id = id;
        this.exercises = exercises;
        this.sets = sets;
        this.date = date;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Exercise> getExercises() {
        return exercises;
    }

    public void setExercises(List<Exercise> exercises) {
        this.exercises = exercises;
    }


    public int getSets() {
        return sets;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "TrainingUnit{" +
                "id=" + id +
                ", exercises=" + exercises +
                ", sets=" + sets +
                ", date=" + date +
                '}';
    }
}
