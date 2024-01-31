package main;

import main.clients.*;
import main.clinic.VeterinaryClinic;
import main.staff.Doctor;
import main.staff.Nurse;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Солнышко", new Owner("Сергей Валерьевич"),
                LocalDate.of(2021, 10, 5), new Illness("Лишай"), 30.0);
        Dog dog = new Dog("Чапай", new Owner("Иван Петрович"),
                LocalDate.of(2023, 11, 6), new Illness("Рваная рана левой ноги"));
        Duck duck = new Duck("Утя", new Owner("Василий Индратович"),
                LocalDate.of(2023, 2, 25), new Illness("Потерял крыло"));

        Doctor doctor = new Doctor("Петрович", LocalDate.of(2001, 11, 6));
        Nurse nurse = new Nurse("Алиса", LocalDate.of(2009, 3, 23));

        VeterinaryClinic clinic = new VeterinaryClinic("ЖИВОТИНКА");

        System.out.println(cat.run(34));
        System.out.println(cat.run());
        System.out.println();

        System.out.println(dog.swim(15));
        System.out.println(dog.swim());
        System.out.println(dog.run(45));
        System.out.println(dog.run());
        System.out.println();

        System.out.println(duck.swim(2));
        System.out.println(duck.swim());
        System.out.println(duck.run(67));
        System.out.println(duck.run());
        System.out.println(duck.fly(72));
        System.out.println(duck.fly());

        System.out.println("------------------------------------------------------------");

        System.out.println(doctor.getSpecialization());
        doctor.performDuties();
        doctor.diagnosePatient("Утя", "Стерся клюв");
        doctor.givesInstructions("Алиса", "Чапай", "парацетамол");
        System.out.println();

        nurse.performDuties();
        nurse.assistDoctor("Петрович");
        nurse.administerMedication("Солнышко", "глюкоза");

        System.out.println("------------------------------------------------------------");

        System.out.println(clinic.getName());
        clinic.admitPatient(cat);
        clinic.admitPatient(dog);
        clinic.admitPatient(duck);
        System.out.println(clinic.getPatients());
        System.out.println();
        clinic.getFlyAnimals();
        clinic.getRunAnimals();
        clinic.getSwimAnimals();
    }
}

