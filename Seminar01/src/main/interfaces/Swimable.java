package main.interfaces;

public interface Swimable {
    String swim(double speed);

    default String swim() {
        return swim(6);
    }
}
