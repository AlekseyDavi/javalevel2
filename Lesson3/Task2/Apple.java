package Lesson3.Task2;

public class Apple extends Fruit {
    double weightOfOneFruit = 1.0;

    public Apple(double quantity) {
        super(quantity);
    }

    @Override
    public double getWeight() {
        return super.getWeight() * weightOfOneFruit;
    }
}
