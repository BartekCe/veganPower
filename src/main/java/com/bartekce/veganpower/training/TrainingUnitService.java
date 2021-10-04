package com.bartekce.veganpower.training;

import com.bartekce.veganpower.exercise.Exercise;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TrainingUnitService {

    private final TrainingUnitRepository trainingUnitRepository;



    final TrainingStatus PLANNED = TrainingStatus.PLANNED;

    public TrainingUnitService(TrainingUnitRepository trainingUnitRepository) {
        this.trainingUnitRepository = trainingUnitRepository;
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
        List<TrainingUnit> trainingUnits = new ArrayList<>();

        if (maxPushUps < 100 && maxPushUps >= 60) {
            trainingUnits.addAll(planTrainingForOver_60());
        } else if (maxPushUps < 60 && maxPushUps >= 56) {
            trainingUnits.addAll(plaTrainingBetween_56_and_60());
        } else if (maxPushUps <= 55 && maxPushUps >= 51) {
            trainingUnits.addAll(planTrainingBetween_51_and_55());
        } else if (maxPushUps <= 50 && maxPushUps >= 46) {
            trainingUnits.addAll(planTrainingBetween_46_and_50());
        } else if (maxPushUps <= 45 && maxPushUps >= 41) {
            trainingUnits.addAll(planTrainingBetween_41_and_45());
        } else if (maxPushUps <= 40 && maxPushUps >= 36) {
            trainingUnits.addAll(planTrainingBetween_36_and_40());
        } else if (maxPushUps <= 35 && maxPushUps >= 31) {
            trainingUnits.addAll(planTrainingBetween_31_and_35());
        } else if (maxPushUps <= 30 && maxPushUps >= 26) {
            trainingUnits.addAll(planTrainingBetween_26_and_30());
        } else if (maxPushUps <= 25 && maxPushUps >= 21) {
            trainingUnits.addAll(planTrainingBetween_21_and_25());
        } else if (maxPushUps <= 20 && maxPushUps >= 11) {
            trainingUnits.addAll(planTrainingBetween_11_and_20());
        } else if (maxPushUps <= 10 && maxPushUps >= 6) {
            trainingUnits.addAll(planTrainingBetween_6_and_10());
        } else {
            trainingUnits.addAll(planTrainingForLessThen_6());
        }
        return trainingUnits;
    }

    public List<TrainingUnit> planTrainingForOver_60() {
        return trainingUnitRepository.saveAll(List.of(
                new TrainingUnit(PLANNED, 60, List.of(new Exercise(List.of(35, 49, 45, 45, 55)))),
                new TrainingUnit(PLANNED, 45, List.of(new Exercise(List.of(22, 22, 30, 30, 24, 24, 18, 18, 59)))),
                new TrainingUnit(PLANNED, 45, List.of(new Exercise(List.of(28, 28, 35, 35, 27, 27, 23, 23, 60))))));
    }

    public List<TrainingUnit> plaTrainingBetween_56_and_60() {
        return trainingUnitRepository.saveAll(List.of(
                new TrainingUnit(PLANNED, 60, List.of(new Exercise(List.of(30, 44, 40, 40, 55)))),
                new TrainingUnit(PLANNED, 45, List.of(new Exercise(List.of(22, 22, 27, 27, 24, 23, 18, 18, 58)))),
                new TrainingUnit(PLANNED, 45, List.of(new Exercise(List.of(26, 26, 33, 33, 26, 26, 22, 22, 60))))));
    }

    public List<TrainingUnit> planTrainingBetween_51_and_55() {
        return trainingUnitRepository.saveAll(List.of(
                new TrainingUnit(PLANNED, 60, List.of(new Exercise(List.of(30, 39, 35, 35, 42)))),
                new TrainingUnit(PLANNED, 45, List.of(new Exercise(List.of(20, 20, 23, 23, 20, 20, 18, 18, 53)))),
                new TrainingUnit(PLANNED, 45, List.of(new Exercise(List.of(22, 22, 30, 30, 25, 25, 18, 18, 55))))));
    }

    public List<TrainingUnit> planTrainingBetween_46_and_50() {
        return trainingUnitRepository.saveAll(List.of(
                new TrainingUnit(PLANNED, 60, List.of(new Exercise(List.of(30, 34, 30, 30, 40)))),
                new TrainingUnit(PLANNED, 45, List.of(new Exercise(List.of(19, 19, 23, 23, 19, 19, 22, 37)))),
                new TrainingUnit(PLANNED, 45, List.of(new Exercise(List.of(20, 20, 27, 27, 21, 21, 21, 44))))));
    }

    public List<TrainingUnit> planTrainingBetween_41_and_45() {
        return trainingUnitRepository.saveAll(List.of(
                new TrainingUnit(PLANNED, 60, List.of(new Exercise(List.of(27, 29, 25, 25, 35)))),
                new TrainingUnit(PLANNED, 45, List.of(new Exercise(List.of(19, 19, 22, 22, 18, 18, 22, 35)))),
                new TrainingUnit(PLANNED, 45, List.of(new Exercise(List.of(20, 20, 24, 24, 20, 20, 22, 40))))));
    }

    public List<TrainingUnit> planTrainingBetween_36_and_40() {
        return trainingUnitRepository.saveAll(List.of(
                new TrainingUnit(PLANNED, 60, List.of(new Exercise(List.of(22, 24, 20, 20, 25)))),
                new TrainingUnit(PLANNED, 45, List.of(new Exercise(List.of(15, 15, 18, 18, 15, 15, 14, 30)))),
                new TrainingUnit(PLANNED, 45, List.of(new Exercise(List.of(18, 18, 20, 20, 17, 17, 15, 35))))));
    }

    public List<TrainingUnit> planTrainingBetween_31_and_35() {
        return trainingUnitRepository.saveAll(List.of(
                new TrainingUnit(PLANNED, 60, List.of(new Exercise(List.of(17, 19, 15, 15, 20)))),
                new TrainingUnit(PLANNED, 45, List.of(new Exercise(List.of(10, 10, 13, 13, 10, 10, 9, 25)))),
                new TrainingUnit(PLANNED, 45, List.of(new Exercise(List.of(13, 13, 15, 15, 12, 12, 10, 30))))));
    }

    public List<TrainingUnit> planTrainingBetween_26_and_30() {
        return trainingUnitRepository.saveAll(List.of(
                new TrainingUnit(PLANNED, 60, List.of(new Exercise(List.of(14, 18, 14, 14, 20)))),
                new TrainingUnit(PLANNED, 90, List.of(new Exercise(List.of(20, 25, 15, 15, 23)))),
                new TrainingUnit(PLANNED, 120, List.of(new Exercise(List.of(20, 27, 18, 18, 25)))),
                new TrainingUnit(PLANNED, 60, List.of(new Exercise(List.of(21, 25, 21, 21, 27)))),
                new TrainingUnit(PLANNED, 90, List.of(new Exercise(List.of(25, 29, 25, 25, 30)))),
                new TrainingUnit(PLANNED, 120, List.of(new Exercise(List.of(29, 33, 29, 29, 33))))));
    }

    public List<TrainingUnit> planTrainingBetween_21_and_25() {
        return trainingUnitRepository.saveAll(List.of(
                new TrainingUnit(PLANNED, 60, List.of(new Exercise(List.of(12, 17, 13, 13, 17)))),
                new TrainingUnit(PLANNED, 90, List.of(new Exercise(List.of(14, 19, 14, 14, 19)))),
                new TrainingUnit(PLANNED, 120, List.of(new Exercise(List.of(16, 21, 15, 15, 21)))),
                new TrainingUnit(PLANNED, 60, List.of(new Exercise(List.of(18, 22, 16, 16, 21)))),
                new TrainingUnit(PLANNED, 90, List.of(new Exercise(List.of(20, 25, 20, 20, 23)))),
                new TrainingUnit(PLANNED, 120, List.of(new Exercise(List.of(23, 28, 22, 22, 25))))));
    }

    public List<TrainingUnit> planTrainingBetween_11_and_20() {
        return trainingUnitRepository.saveAll(List.of(
                new TrainingUnit(PLANNED, 60, List.of(new Exercise(List.of(8, 9, 7, 7, 8)))),
                new TrainingUnit(PLANNED, 90, List.of(new Exercise(List.of(9, 10, 8, 8, 10)))),
                new TrainingUnit(PLANNED, 120, List.of(new Exercise(List.of(11, 13, 9, 9, 13)))),
                new TrainingUnit(PLANNED, 60, List.of(new Exercise(List.of(12, 14, 10, 10, 15)))),
                new TrainingUnit(PLANNED, 90, List.of(new Exercise(List.of(13, 15, 11, 11, 17)))),
                new TrainingUnit(PLANNED, 120, List.of(new Exercise(List.of(14, 16, 13, 13, 19))))));
    }

    public List<TrainingUnit> planTrainingBetween_6_and_10() {
        return trainingUnitRepository.saveAll(List.of(
                new TrainingUnit(PLANNED, 60, List.of(new Exercise(List.of(5, 6, 4, 4, 5)))),
                new TrainingUnit(PLANNED, 90, List.of(new Exercise(List.of(6, 7, 6, 6, 7)))),
                new TrainingUnit(PLANNED, 120, List.of(new Exercise(List.of(8, 10, 7, 7, 10)))),
                new TrainingUnit(PLANNED, 60, List.of(new Exercise(List.of(9, 11, 8, 8, 11)))),
                new TrainingUnit(PLANNED, 90, List.of(new Exercise(List.of(10, 12, 9, 9, 13)))),
                new TrainingUnit(PLANNED, 120, List.of(new Exercise(List.of(12, 13, 10, 10, 15))))));
    }

    public List<TrainingUnit> planTrainingForLessThen_6() {
        return List.of();
    }

    public void setTrainingsDates(List<TrainingUnit> trainings, List<LocalDate> dateOfTrainings) {
        for(int i =0; i < trainings.size(); i ++){
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