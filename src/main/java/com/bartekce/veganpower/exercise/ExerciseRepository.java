package com.bartekce.veganpower.exercise;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExerciseRepository extends JpaRepository<Exercise, Long> {

    Exercise getByName(String name);

    Exercise findByName(String name);

    List<Exercise> findAllByName(String name);

}
