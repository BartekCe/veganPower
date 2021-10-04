package com.bartekce.veganpower.exercise;

import lombok.Getter;

import java.util.List;

@Getter
public class ExerciseDto {
    private Long id;
    private String name;
    private List<Integer> reps;
}
