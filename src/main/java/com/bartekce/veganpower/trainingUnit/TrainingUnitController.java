package com.bartekce.veganpower.trainingUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TrainingUnitController {
    private final TrainingUnitService trainingUnitService;

    @Autowired
    public TrainingUnitController(TrainingUnitService trainingUnitService) {
        this.trainingUnitService = trainingUnitService;
    }

    @GetMapping("/trainingUnits")
    public List<TrainingUnit> getTrainingUnits()
    {
        return trainingUnitService.getTrainingUnits();
    }

}
