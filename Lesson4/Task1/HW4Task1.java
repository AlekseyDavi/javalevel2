package Lesson4.Task1;

import java.util.*;


public class HW4Task1 {


    public static void main(String[] args) {
        ArrayList<Integer> quality = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
        List<String> list = new ArrayList<>(Arrays.asList(
                "Lorem ", "veritatis ", "sequi ", "Lorem ", "sequi ",
                "pariatur", "Lorem ", "veritatis ", "avoids ", "quis ",
                "culpa ", "sequi ", "pariatur", "quis ", "veritatis ",
                "quis ", "veritatis ", "sequi ", "avoids ", "pariatur"));

        HashSet<String> hashUniqueElements = new HashSet<>(list);
        List<String> listUniqueElements = new ArrayList<>(hashUniqueElements);
        System.out.println(listUniqueElements);
        for (int i = 0; i < listUniqueElements.size(); i++) {
            quality.set(i, Collections.frequency(list, listUniqueElements.get(i)));
            System.out.println(listUniqueElements.get(i) + " всего " + quality.get(i));
        }

    }

}

