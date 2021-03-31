package Lesson3.Task2;

public class HWTask2 {

    public static void main(String[] args) {

        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        appleBox.addFruit((new Apple(324)));
        appleBox.getWeight();

        orangeBox.addFruit(new Orange(34));
        System.out.println("Вес апельсинов " + orangeBox.getWeight() + " Вес яблок " + appleBox.getWeight());
        appleBox.compare(orangeBox);

    }

    public void moveFruit(Box<Orange> boxNew, Box<Orange> boxOld) {
        boxNew.addFruit(new Orange(boxOld.getQuality()));
    }
}

