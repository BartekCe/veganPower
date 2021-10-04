package com.bartekce.veganpower.training;

import com.bartekce.veganpower.training.strategy.*;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class TrainingUnitService {

    private final TrainingUnitRepository trainingUnitRepository;
    private final StrategiesList strategies;

    public TrainingUnitService(TrainingUnitRepository trainingUnitRepository) {
        this.trainingUnitRepository = trainingUnitRepository;
        this.strategies = new StrategiesList();
    }

    public TrainingUnit addTrainingUnit(TrainingUnit trainingUnit) {
        return trainingUnitRepository.save(trainingUnit);
    }

    public TrainingUnit getTrainingUnitById(Long id) {
        return trainingUnitRepository.findById(id).orElse(null);
    }

    public List<TrainingUnit> getTrainingUnits() {
        return trainingUnitRepository.findAll();
    }

    public TrainingUnit updateTrainingUnit(TrainingDto trainingDto) {
        TrainingUnit updateTrainingUnit = trainingUnitRepository.findById(trainingDto.getId()).orElse(null);
        assert updateTrainingUnit != null;
        updateTrainingUnit.setExercises(trainingDto.getExercises());
        updateTrainingUnit.setTrainingStatus(trainingDto.getTrainingStatus());
        return trainingUnitRepository.save(updateTrainingUnit);
    }

    public LocalDate getTrainingDate(long id) {
        return trainingUnitRepository.findById(id).get().getDateOfTraining();
    }

    public List<TrainingUnit> getTodayTrainings(String date) {
        return trainingUnitRepository.findAllByDateOfTraining(LocalDate.parse(date));
    }

    public List<TrainingUnit> addTrainings(int maxPushUps) {
        return strategies.getStrategies().stream().filter(s -> s.shouldPopulate(TrainingStrategy.method(maxPushUps)))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Could not found strategy for: '" + maxPushUps + "' pushUps"))
                .populateTraining(this);
    }

    public List<TrainingUnit> saveAll(List<TrainingUnit> trainings) {
        return trainingUnitRepository.saveAll(trainings);
    }

    public void setTrainingsDates(List<TrainingUnit> trainings, List<LocalDate> dateOfTrainings) {
        for (int i = 0; i < trainings.size(); i++) {
            trainings.get(i).setDateOfTraining(dateOfTrainings.get(i));
        }
        trainingUnitRepository.saveAll(trainings);
    }

    public void updateTrainingDate(TrainingDateDto trainingDateDto) {
        TrainingUnit trainingUnit = trainingUnitRepository.findById(trainingDateDto.getId()).get();
        trainingUnit.setDateOfTraining(trainingDateDto.getDateOfTraining());
        trainingUnitRepository.save(trainingUnit);
    }
}