package Lesson4;

import java.sql.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> cars = Arrays.asList("Rio", "Cerato", "Sportage", "Soul", "Mohave", "Soul", "Picanto", "Sorento",
                "Rio", "Sportage", "Carnival");

        Set<String> uniq = new HashSet<String> (cars);
        System.out.println(cars.toString());
        System.out.println(uniq.toString());

        for (String key:uniq) {
            System.out.println(key + "-" + Collections.frequency(cars, key));
        }
    }
}
