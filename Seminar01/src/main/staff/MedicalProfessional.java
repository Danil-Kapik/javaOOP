package main.staff;

import java.time.LocalDate;

public abstract class MedicalProfessional {
    protected String name;
    protected LocalDate startDate;

    public MedicalProfessional(String name, LocalDate startDate) {
        this.name = name;
        this.startDate = startDate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public abstract void performDuties();
}
