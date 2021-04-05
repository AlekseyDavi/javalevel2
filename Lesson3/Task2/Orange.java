package Lesson3.Task2;

public class Orange extends Fruit {
    double weightOfOneFruit = 1.5;

    public Orange(double quality) {
        super(quality);

    }

    @Override
    public double getWeight() {
        return super.getWeight() * weightOfOneFruit;
    }
}
