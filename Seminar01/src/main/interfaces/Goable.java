package main.interfaces;

public interface Goable {
    String run(double speed);

    default String run() {
        return run(20);
    }
}
