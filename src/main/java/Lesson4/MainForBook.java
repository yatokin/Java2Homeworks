package Lesson4;

public class MainForBook {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Ivanov", "123123");
        phoneBook.add("Ivanov", "456456");
        phoneBook.add("Ivanov", "789789");
        phoneBook.add("Ivanov", "123123");
        phoneBook.add("Petrov", "818181");
        phoneBook.add("Ershov", "999999");

        System.out.println(phoneBook.get("Ivanov"));
        System.out.println(phoneBook.get("Ershov"));
        System.out.println(phoneBook.get("Petrov"));

    }
}
