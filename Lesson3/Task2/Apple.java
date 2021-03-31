package Lesson3.Task2;

public class Apple extends Fruit {
    double weightOfOneFruit = 1.0;

    public Apple(double quality) {
        super(quality);
    }

    @Override
    public double getWeight() {
        return super.getWeight() * weightOfOneFruit;
    }
}
