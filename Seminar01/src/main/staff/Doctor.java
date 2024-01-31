package main.staff;

import java.time.LocalDate;

public class Doctor extends MedicalProfessional {
    private String specialization;

    public Doctor(String name, LocalDate startDate, String specialization) {
        super(name, startDate);
        this.specialization = specialization;
    }

    public Doctor(String name, LocalDate startDate) {
        this(name, startDate, "Ветеринарный врач");
    }

    public String getSpecialization() {
        return specialization;
    }

    @Override
    public void performDuties() {
        System.out.println("Доктор " + name + " начинает процедуру лечения.");
    }

    public void diagnosePatient(String patientName, String symptoms) {
        System.out.println("Доктор " + name + " ставит " + patientName + " диагноз: " + symptoms);
    }

    public void givesInstructions(String nameNurse, String patientName, String medication) {
        System.out.println("Доктор " + name + " дает указание " + nameNurse + " дать " + patientName + " " + medication);
    }
}
