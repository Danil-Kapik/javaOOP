package main.clinic;
import main.clients.Animal;
import main.interfaces.Flyable;
import main.interfaces.Goable;
import main.interfaces.Swimable;
import main.staff.Doctor;
import main.staff.Nurse;

import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic {
    private String name;
    private List<Doctor> doctors;
    private List<Nurse> nurses;
    private List<Animal> patients;

    public VeterinaryClinic(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.nurses = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Animal> getPatients() {
        return patients;
    }

    public void getFlyAnimals() {
        List<String> flyingAnimalsList = new ArrayList<>();

        for (Animal animal : patients) {
            if (animal instanceof Flyable) {
                flyingAnimalsList.add(animal.getNickName());
            }
        }
        System.out.println("Летающие - " + flyingAnimalsList);
    }

    public void getRunAnimals() {
        List<String> runingAnimalsList = new ArrayList<>();

        for (Animal animal : patients) {
            if (animal instanceof Goable) {
                runingAnimalsList.add(animal.getNickName());
            }
        }
        System.out.println("Бегающие - " + runingAnimalsList);
    }

    public void getSwimAnimals() {
        List<String> swimingAnimalsList = new ArrayList<>();

        for (Animal animal : patients) {
            if (animal instanceof Swimable) {
                swimingAnimalsList.add(animal.getNickName());
            }
        }
        System.out.println("Плавающие - " + swimingAnimalsList);
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
        System.out.println("Доктор " + doctor.getName() + " добавлен в клинику " + name);
    }

    public void addNurse(Nurse nurse) {
        nurses.add(nurse);
        System.out.println("Медсестра " + nurse.getName() + " добавлена в клинику " + name);
    }

    public void admitPatient(Animal patient) {
        patients.add(patient);
        System.out.println("Пациент " + patient.getNickName() + " принят в клинику " + name);
    }


}
