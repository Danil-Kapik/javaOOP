package main.drugstore;

public abstract class Component implements Comparable<Component> {
    private String title;
    private Double weight;
    private int power;

    public Component(String title, Double weight, int power) { //ALT + Insert
        this.title = title;
        this.weight = weight;
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return String.format("Title = %s, power = %s", title, power);
    }

    @Override
    public int compareTo(Component o) {
        return Integer.compare(this.power, o.power);
    }
}