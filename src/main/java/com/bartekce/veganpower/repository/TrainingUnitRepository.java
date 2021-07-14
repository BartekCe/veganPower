package com.bartekce.veganpower.repository;

import com.bartekce.veganpower.entity.TrainingUnit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainingUnitRepository extends JpaRepository<TrainingUnit, Long> {
}
