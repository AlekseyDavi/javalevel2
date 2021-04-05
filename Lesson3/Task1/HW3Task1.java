package Lesson3.Task1;


import java.util.ArrayList;

public class HW3Task1 {
    private static java.lang.Object Object;

    public static void length(int length, int cell1, int cell2) throws SizeException {
        if (length < cell1 || length < cell2) {
            throw new SizeException("Некорректное значение ячейки");
        }
    }

    public static void main(String[] args) {

        ArrayList<Object> box1 = new ArrayList(2);
        box1.add(345);
        box1.add("ddewdfew");
         System.out.println(box1.get(0) + " " + box1.get(1));
        SwapMethod(1, 0, box1);
         System.out.println(box1.get(0) + " " + box1.get(1));
    }

    public static void SwapMethod(int cell1, int cell2, ArrayList<Object> box) {
        try {
            length(box.size(), cell1, cell2);
            GenBox<Object> timeObject = new GenBox(box.get(cell2));
            box.set(cell2, box.get(cell1));
            box.set(cell1, timeObject.getObject());
        } catch (SizeException e) {
            e.printStackTrace();
        }
    }

}
