package com.bartekce.veganpower.cycle;

import com.bartekce.veganpower.training.TrainingUnit;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class Cycle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private CycleStatus cycleStatus;
    @OneToMany
    private List<TrainingUnit> trainings;

    public Cycle(List<TrainingUnit> trainings) {
        this.cycleStatus = CycleStatus.IN_PROGRESS;
        addTrainings(trainings);
    }

    public void addTrainings(List<TrainingUnit> trainings) {
        setTrainings(trainings);
    }

    @Override
    public String toString() {
        return "Cycle{" +
                "id=" + id +
                ", cycleStatus=" + cycleStatus +
                ", trainings=" + trainings +
                '}';
    }
}
