package com.bartekce.veganpower.entity;

import com.bartekce.veganpower.entity.Exercise;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
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
    @OneToMany(cascade = CascadeType.ALL)
    private List<Exercise> exercises = new ArrayList<>();

}
