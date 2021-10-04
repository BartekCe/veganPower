package com.bartekce.veganpower.training;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface TrainingUnitRepository extends JpaRepository<TrainingUnit, Long> {
    List<TrainingUnit> findAllByDateOfTraining(LocalDate date);
}
