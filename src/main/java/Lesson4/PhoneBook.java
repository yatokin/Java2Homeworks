package Lesson4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PhoneBook {
    HashMap<String, List<String>>book = new HashMap<>();
    public void add(String surname, String number){
        if (book.containsKey(surname)){
            List<String> numbers = book.get(surname);
            if (!numbers.contains(number)){
                numbers.add(number);
                System.out.println(String.format("Для фамилии %s добавлен номер %s", surname, number));
            } else {
                System.out.println(String.format("Для фамилии %s уже существует номер %s", surname, number));
            }
        } else {
            book.put(surname, new ArrayList<>(Arrays.asList(number)));
            System.out.println(String.format("Для фамилии %s добавлен номер %s", surname, number));
        }
    }

    public List<String> get(String surname){
        return book.get(surname);
    }
}
