package com.bartekce.veganpower.cycle;

import lombok.Getter;

import java.time.LocalDate;
import java.util.List;

@Getter
public class CycleDatesDto {
    private Long id;
    private List<LocalDate> dateOfTrainings;

    @Override
    public String toString() {
        return "CycleDatesDto{" +
                "id=" + id +
                ", dateOfTrainings=" + dateOfTrainings +
                '}';
    }
}
