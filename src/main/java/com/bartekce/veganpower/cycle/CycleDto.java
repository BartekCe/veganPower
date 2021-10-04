package com.bartekce.veganpower.cycle;

import com.bartekce.veganpower.training.TrainingDto;
import lombok.Getter;

import java.util.List;

@Getter
public class CycleDto {
    private Long id;
    private CycleStatus cycleStatus;
    private List<TrainingDto> trainings;

    @Override
    public String toString() {
        return "CycleDto{" +
                "id=" + id +
                ", cycleStatus=" + cycleStatus +
                ", trainings=" + trainings +
                '}';
    }
}
