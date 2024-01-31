package main.interfaces;

public interface Flyable {
    String fly(double speed);

    default String fly() {
        return fly(60);
    }
}
