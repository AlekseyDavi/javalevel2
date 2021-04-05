package Lesson3.Task2;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> fruitList;

    private double weight;
    private double quality;

    public Box() {
        this.fruitList = new ArrayList<>();
    }

    public void addFruit(T fruit) {
        fruitList.add(fruit);

        weight += fruit.getWeight();
        quality +=fruit.getQuality();
    }

    public double getWeight() {
        return weight;
    }
    public double getQuality() {
        return quality;
    }
    public boolean compare(Box<?> box) {
        if (getWeight() == box.getWeight()) {
            return true;
        }
        return false;
    }


}
