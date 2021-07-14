package com.bartekce.veganpower.repository;

import com.bartekce.veganpower.entity.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExerciseRepository extends JpaRepository<Exercise, Long> {

    Exercise getByName(String name);

    Exercise findByName(String name);
}
