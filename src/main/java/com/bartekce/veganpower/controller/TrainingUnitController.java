package com.bartekce.veganpower.controller;

import com.bartekce.veganpower.entity.TrainingUnit;
import com.bartekce.veganpower.service.TrainingUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TrainingUnitController {

    @Autowired
    private TrainingUnitService trainingUnitService;

    @PostMapping(path="/addTrainingUnit")
    public TrainingUnit saveTrainingUnit(@RequestBody TrainingUnit trainingUnit) {
        return trainingUnitService.addTrainingUnit(trainingUnit);
    }
    @GetMapping(path = "/trainingUnit/{id}")
    public TrainingUnit getTrainingUnitById(@PathVariable Long id){
        return trainingUnitService.getTrainingUnitById(id);
    }
    @PostMapping(path = "/update")
    public TrainingUnit updateTrainingUnitById(@RequestBody TrainingUnit trainingUnit){
        return trainingUnitService.updateTrainingUnit(trainingUnit);
    }
}
