package Lesson2;

public class HW2 {
    public static void main(String[] args) {
        Object[][] massive = new Object[4][4];
        try {
            length(massive.length);
            length(massive[1].length);

            int sum = 0;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    try {
                        sum += convertToInt(massive[i][j], i, j);
                    } catch (MyArrayDataException e) {
                        e.printStackTrace();
                    }
                }
            }

        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }
    }

    public static void length(int length) throws MyArraySizeException {
        if (length != 4) {
            throw new MyArraySizeException("Массив должен быть 4*4");
        }
    }

    public static int convertToInt(Object massive, int i, int j) throws MyArrayDataException {
        if (massive == null || massive instanceof String) {
            throw new MyArrayDataException("В ячейке y= " + i + " x= " + j + " нечисловое значение.");
        }
        return (int) massive;
    }
}


