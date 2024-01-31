package main.clients;

import main.interfaces.Flyable;
import main.interfaces.Goable;
import main.interfaces.Swimable;

import java.time.LocalDate;

public class Duck extends Animal implements Flyable, Swimable, Goable {
    public Duck(String nickname, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickname, owner, birthDate, illness);
    }

    public Duck() {
    }

    @Override
    public String run(double speed) {
        return String.format("%s бежит со скоростью %.2f", getNickName(), speed);
    }

    @Override
    public String fly(double speed) {
        return String.format("%s летит со скоростью %.2f", getNickName(), speed);
    }

    @Override
    public String swim(double speed) {
        return String.format("%s плывет со скоростью %.2f", getNickName(), speed);
    }
}
