package com.bartekce.veganpower.trainingUnit;

import com.bartekce.veganpower.exercises.Exercise;

import java.util.Date;
import java.util.List;

public class TrainingUnit {

    private Long id;
    private List<Exercise> exercises;

    private int sets;
    private Date date;


    public TrainingUnit(Long id, List<Exercise> exercises, int sets, Date date) {
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
