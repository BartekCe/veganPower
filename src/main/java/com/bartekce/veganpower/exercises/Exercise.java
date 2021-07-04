package com.bartekce.veganpower.exercises;

public class Exercise {
    private String name;
    private float weight;
    private int reps;


    public Exercise(String name, float weight, int reps) {
        this.name = name;
        this.weight = weight;
    }

    public int getReps() {
        return reps;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }


}
