package com.bartekce.veganpower.cycle;

import com.bartekce.veganpower.training.TrainingDto;
import com.bartekce.veganpower.training.TrainingStatus;
import com.bartekce.veganpower.training.TrainingUnitService;
import com.bartekce.veganpower.user.UserEntity;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
public class CycleService {
    private final CycleRepository cycleRepository;
    private final TrainingUnitService trainingUnitService;

    public CycleService(CycleRepository cycleRepository, TrainingUnitService trainingUnitService) {
        this.cycleRepository = cycleRepository;
        this.trainingUnitService = trainingUnitService;
    }

    public Cycle addCycle(UserEntity user) {
        return cycleRepository.save(new Cycle(trainingUnitService.addTrainings(user.getMaxPush_ups())));
    }

    public Cycle findCycleById(Long id) {
        return cycleRepository.getById(id);
    }

    public void updateCycle(Cycle cycle) {
        cycleRepository.save(cycle);
    }

    public void updateCycleStatus(final Long cycleId) {
        Cycle cycle = findCycleById(cycleId);
        boolean b = cycle.getTrainings().stream().anyMatch(t -> t.getTrainingStatus().equals(TrainingStatus.PLANNED));
        if (!b) {
            cycle.setCycleStatus(CycleStatus.DONE);
            save(cycle);
        }
    }

    public void save(Cycle cycle) {
        cycleRepository.save(cycle);
    }

    public void updateTraining(TrainingDto trainingDto) {
        trainingUnitService.updateTrainingUnit(trainingDto);
        updateCycleStatus(trainingDto.getCycleId());
    }

    public void setCycleDates(CycleDatesDto cycleDatesDto) {
        Cycle cycle = findCycleById(cycleDatesDto.getId());
            trainingUnitService.setTrainingsDates(cycle.getTrainings(), cycleDatesDto.getDateOfTrainings());
    }

    public boolean isCycleDone(Long id) {
        Optional<Cycle> cycle = cycleRepository.findById(id);
        if(cycle.isPresent()){
            return cycle.get().getCycleStatus().equals(CycleStatus.DONE);
        }
        else throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                "Cycle with this id: " + id + "doesn't exist");
    }
}

