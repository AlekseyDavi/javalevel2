package Lesson7;

import java.io.IOException;

public class Controller {

    AccuWeatherModel weatherModel = new AccuWeatherModel();


    public void getWeather(int command, String selectedCity) throws IOException {
        switch (command) {
            case (1):
                weatherModel.getWeather(selectedCity, "1day", 1);
                break;
            case (2):
                weatherModel.getWeather(selectedCity, "5day", 5);
                break;
            case (3):
//TODO: архив
                break;
            default:
                System.out.println("Неверное значение даты");
                System.exit(1);
        }

    }
}

