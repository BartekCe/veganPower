package com.bartekce.veganpower.training;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TrainingUnitController {

    private final TrainingUnitService trainingUnitService;

    public TrainingUnitController(TrainingUnitService trainingUnitService) {
        this.trainingUnitService = trainingUnitService;
    }

    @PostMapping(path="/addTrainingUnit")
    public TrainingUnit saveTrainingUnit(@RequestBody TrainingUnit trainingUnit) {
        return trainingUnitService.addTrainingUnit(trainingUnit);
    }
    @GetMapping(path = "/trainingUnit/{id}")
    public TrainingUnit getTrainingUnitById(@PathVariable Long id){
        return trainingUnitService.getTrainingUnitById(id);
    }
    @PostMapping(path = "/update")
    public TrainingUnit updateTrainingUnitById(@RequestBody TrainingDto trainingDto){
        return trainingUnitService.updateTrainingUnit(trainingDto);
    }
    @GetMapping("/today-training/{date}")
    public List<TrainingUnit> getTodayTrainings(@PathVariable String date){
        return trainingUnitService.getTodayTrainings(date);
    }
    @PostMapping("/changeTrainingDate")
    public void changeTrainingDate(@RequestBody TrainingDateDto trainingDateDto){
        trainingUnitService.updateTrainingDate(trainingDateDto);
    }
}
