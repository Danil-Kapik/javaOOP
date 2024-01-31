package main.staff;

import java.time.LocalDate;

public class Nurse extends MedicalProfessional{

    public Nurse(String name, LocalDate startDate) {
        super(name, startDate);
    }

    @Override
    public void performDuties() {
        System.out.println("Медсестра " + name + " выполняет основные обязанности.");
    }

    public void assistDoctor(String doctorName) {
        System.out.println("Медсестра " + name + " помогает доктору " + doctorName);
    }

    public void administerMedication(String patientName, String medication) {
        System.out.println("Медсестра " + name + " дает " + patientName + " лекарство: " + medication);
    }
}
