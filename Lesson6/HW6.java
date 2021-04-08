package Lesson6;

import okhttp3.*;

import java.io.IOException;

public class HW6 {
    private static final String PROTOKOL = "http";
    private static final String API_KEY = "72MRSvxERlKD73bGIjehNUHiAASg98q0";
    private static final String BASE_HOST = "dataservice.accuweather.com";
    private static final String CURRENT_CONDITIONS_ENDPOINT = "currentconditions";
    private static final String API_V1 = "v1";
    private static final String DAILY = "daily";
    private static final String DAY = "5day";
    private static final String LOCATIONS_ENDPOINT = "locations";
    private static final String FORECASTS = "forecasts";
    private static final String CITIES_ENDPOINT = "cities";
    private static final String AUTOCOMPLETE_ENDPOINT = "autocomplete";

    private static final OkHttpClient okHttpClient = new OkHttpClient();

    public static String detectCityKey(String selectedCity) throws IOException {
        HttpUrl httpUrl = new HttpUrl.Builder()
                .scheme(PROTOKOL)
                .host(BASE_HOST)
                .addPathSegment(LOCATIONS_ENDPOINT)
                .addPathSegment(API_V1)
                .addPathSegment(CITIES_ENDPOINT)
                .addPathSegments(AUTOCOMPLETE_ENDPOINT)
                .addQueryParameter("apikey", API_KEY)
                .addQueryParameter("q", selectedCity)
                .build();

        Request request = new Request.Builder()
                .addHeader("accept", "application/json")
                .url(httpUrl)
                .build();
        Response response = okHttpClient.newCall(request).execute();
        String cityKey = response.body().string();
        String[] splits = cityKey.split("\"");
        cityKey = splits[5];
        return cityKey;
    }

    public static void main(String[] args) throws IOException {
        getWeather("Saint Petersburg");
    }

    public static void getWeather(String selectedCity) throws IOException {
        String cityKey = detectCityKey(selectedCity);
        HttpUrl httpUrl = new HttpUrl.Builder()
                .scheme(PROTOKOL)
                .host(BASE_HOST)
                .addPathSegment(FORECASTS)
                .addPathSegment(API_V1)
                .addPathSegments(DAILY)
                .addPathSegments(DAY)
                .addPathSegment(cityKey)
                .addQueryParameter("apikey", API_KEY)
                .build();
        System.out.println(httpUrl);
        Request request = new Request.Builder()
                .addHeader("accept", "application/json")
                .url(httpUrl)
                .build();
        Response response = okHttpClient.newCall(request).execute();
        String responseString = response.body().string();
        System.out.println(responseString);

    }
}
