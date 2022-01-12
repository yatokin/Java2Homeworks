package Lesson6;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(new Weather().getWeatherByLocationId(295212, "TjgRbruj4beF5nFzbibYEntu4l6TCIcM").body().string());
    }
}
