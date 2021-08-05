package com.bartekce.veganpower.service;

import com.bartekce.veganpower.entity.TrainingUnit;
import com.bartekce.veganpower.repository.TrainingUnitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class TrainingUnitService {

    @Autowired
    private TrainingUnitRepository trainingUnitRepository;

    public TrainingUnit addTrainingUnit(TrainingUnit trainingUnit) {
        return trainingUnitRepository.save(trainingUnit);
    }

    public TrainingUnit getTrainingUnitById(Long id) {
        return trainingUnitRepository.findById(id).orElse(null);
    }

    public List<TrainingUnit> getTrainingUnits() {
        return trainingUnitRepository.findAll();
    }

    public TrainingUnit updateTrainingUnit(TrainingUnit trainingUnit) {
        TrainingUnit updateTrainingUnit = trainingUnitRepository.findById(trainingUnit.getId()).orElse(null);
        assert updateTrainingUnit != null;
        updateTrainingUnit.setDateOfTraining(trainingUnit.getDateOfTraining());
        updateTrainingUnit.setExercises(trainingUnit.getExercises());
        return trainingUnitRepository.save(updateTrainingUnit);
    }
}

