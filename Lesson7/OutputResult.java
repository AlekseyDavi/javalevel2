package Lesson7;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class OutputResult {
    public static void outputResult(String[] minimum, String[] maximum, int numberDay, String town) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        double minimumCelsius;
        double maximumCelsius;

        System.out.println(town);
        System.out.println();
        for (int i = 0; i < numberDay; i++) {
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Calendar data = Calendar.getInstance();
            data.add(Calendar.DATE, i);
            System.out.println(dateFormat.format(data.getTime()));
            minimumCelsius = (Double.parseDouble(minimum[i]) - 32) / 1.8;
            String minimumResult = String.format("%.1f", minimumCelsius);
            maximumCelsius = (Double.parseDouble(maximum[i]) - 32) / 1.8;
            String maximumResult = String.format("%.1f", maximumCelsius);
            System.out.println("Temperature: " + minimumResult + "\u2103 - " + maximumResult + "\u2103");
            System.out.println();
        }
        System.exit(0);
    }


}
