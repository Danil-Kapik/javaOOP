package main.clients;

import main.interfaces.Goable;

import java.time.LocalDate;

public class Cat extends Animal implements Goable {

    Double discount;

    public Cat(String nickname, Owner owner, LocalDate birthDate, Illness illness, Double discount) {
        super(nickname, owner, birthDate, illness);
        this.discount = discount;
    }

    public Cat() {
        super();
        this.discount = 10D;
    }

    @Override
    public String run(double speed) {
        return String.format("%s бежит со скоростью %.2f", getNickName(), speed);
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public void meow(){
        System.out.println("Мяяяу!");
    }

    @Override
    public String toString() {
        return String.format("%s, Discount: %.2f", super.toString(), discount);
    }
}
