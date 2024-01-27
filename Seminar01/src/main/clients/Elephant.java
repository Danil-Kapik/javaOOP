package main.clients;

import java.time.LocalDate;

public class Elephant extends Animal {
    public Elephant(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Elephant() {
    }
}
