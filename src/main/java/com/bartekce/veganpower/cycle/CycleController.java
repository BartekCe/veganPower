package com.bartekce.veganpower.cycle;

import com.bartekce.veganpower.training.TrainingDto;
import org.springframework.web.bind.annotation.*;

@RestController
public class CycleController {

    private final CycleService cycleService;

    public CycleController(CycleService cycleService) {
        this.cycleService = cycleService;
    }

    @PostMapping("cycle/updateCycle")
    public void updateCycle(@RequestBody Cycle cycle) {
        cycleService.updateCycle(cycle);
    }

    @PostMapping("/cycle/updateTraining")
    public void updateTraining(@RequestBody TrainingDto trainingDto) {
        cycleService.updateTraining(trainingDto);
    }

    @PostMapping("cycle/planDates")
    public void updateTraining(@RequestBody CycleDatesDto cycleDatesDto) {
        cycleService.setCycleDates(cycleDatesDto);
    }

    @GetMapping("/cycle/checkIfDone/{id}")
    public boolean isCycleDone(@PathVariable Long id) {
        return cycleService.isCycleDone(id);
    }
}
