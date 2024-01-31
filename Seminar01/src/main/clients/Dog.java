package main.clients;

import main.interfaces.Goable;
import main.interfaces.Swimable;

import java.time.LocalDate;

public class Dog extends Animal implements Goable, Swimable {
    public Dog(String nickname, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickname, owner, birthDate, illness); //Сходи в род.класс и вызови 4 параметра
    }

    public Dog(){
        super();
    }

    @Override
    public String run(double speed) {
        return String.format("%s бежит со скоростью %.2f", getNickName(), speed);
    }

    @Override
    public String swim(double speed) {
        return String.format("%s плывет со скоростью %.2f", getNickName(), speed);
    }
}
