package com.bartekce.veganpower.exercises;

public class Exercise {
    private final String name;
    private final float weight;
    private final int reps;

    public Exercise(String name, float weight, int reps) {
        this.name = name;
        this.weight = weight;
        this.reps = reps;
    }

    public int getReps() {
        return reps;
    }

    public String getName() {
        return name;
    }

    public float getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Exercise{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", reps=" + reps +
                '}';
    }
}
