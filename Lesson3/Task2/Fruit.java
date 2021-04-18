package Lesson3.Task2;

public abstract class Fruit {
    private double weight;
    private double quality;

    public Fruit(double quality) {
        this.quality = quality;
    }

    public double getQuantity() {
        return quality;
    }

    public double getWeight() {
        return weight;
    }
}
