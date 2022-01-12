package Lesson6;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Weather {
    private OkHttpClient okHttpClient;

    public Response getLocationId(String city, String key) throws IOException {

        okHttpClient = new OkHttpClient()
                .newBuilder()
                .readTimeout(10, TimeUnit.SECONDS)
                .build();

        HttpUrl url = new HttpUrl.Builder()
                .scheme("http")
                .host("dataservice.accuweather.com")
                .addPathSegment("locations")
                .addPathSegment("v1")
                .addPathSegment("cities")
                .addPathSegment("search")
                .addQueryParameter("apikey", String.format("%s", key))
                .addQueryParameter("q", String.format("%s", city))
                .build();

        Request requesthttp = new Request.Builder()
                .url(url)
                .get()
                .build();

        return okHttpClient.newCall(requesthttp).execute();
    }

    public Response getWeatherByLocationId(int id, String key) throws IOException {

        okHttpClient = new OkHttpClient()
                .newBuilder()
                .readTimeout(10, TimeUnit.SECONDS)
                .build();

        HttpUrl url = new HttpUrl.Builder()
                .scheme("http")
                .host("dataservice.accuweather.com")
                .addPathSegment("forecasts")
                .addPathSegment("v1")
                .addPathSegment("daily")
                .addPathSegment("5day")
                .addPathSegment(Integer.toString(id))
                .addQueryParameter("apikey", String.format("%s", key))
                .build();

        Request requesthttp = new Request.Builder()
                .url(url)
                .get()
                .build();

        return okHttpClient.newCall(requesthttp).execute();
    }
}

