package com.bartekce.veganpower.training;

import com.bartekce.veganpower.exercise.Exercise;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class TrainingUnit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate dateOfTraining;
    private TrainingStatus trainingStatus;
    private int breakTime;
    @OneToMany(targetEntity = Exercise.class, cascade = CascadeType.ALL)
    private List<Exercise> exercises;

    public TrainingUnit(TrainingStatus trainingStatus,int breakTime, List<Exercise> exercises) {
        this.trainingStatus = trainingStatus;
        this.exercises = exercises;
        this.breakTime = breakTime;
    }

    @Override
    public String toString() {
        return "TrainingUnit{" +
                "id=" + id +
                ", dateOfTraining=" + dateOfTraining +
                ", trainingStatus=" + trainingStatus +
                ", breakTime=" + breakTime +
                ", exercises=" + exercises +
                '}';
    }
}
