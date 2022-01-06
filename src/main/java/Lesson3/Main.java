package Lesson3;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] arr = {"el1", "el2", "el3", "el4"};
        System.out.println("Task 1\n" + Arrays.toString(arr));
        swapTwoElements(arr, 0, 3);
        System.out.println(Arrays.toString(arr));

        System.out.println("Task 2");
        Orange orange = new Orange();
        Apple apple = new Apple();
        Box<Orange> orangeBox1 = new Box();
        Box<Orange> orangeBox2 = new Box();
        Box<Apple> appleBox = new Box();

        for (int i = 0; i < 2; i++) {
            orangeBox1.add(new Orange());
        }

        for (int i = 0; i < 4; i++) {
            orangeBox2.add(new Orange());
        }

        for (int i = 0; i < 6; i++) {
            appleBox.add(new Apple());
        }

        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();

        Float orange1Weigth = orangeBox1.getWeight();
        Float orange2Weigth = orangeBox2.getWeight();
        Float appleWeigth = appleBox.getWeight();
        System.out.println("Вес коробки 1 с апельсинами: " + orange1Weigth);
        System.out.println("Вес коробки 2 с апельсинами: " + orange2Weigth);
        System.out.println("Вес коробки 1 с яблоками: " + appleWeigth);

        System.out.println("Сравнить вес orangeBox1 и appleBox: " + orangeBox1.compare(appleBox));
        System.out.println("Сравнить вес orangeBox2 и appleBox: " + orangeBox2.compare(appleBox));

        orangeBox1.moveAt(orangeBox2);
        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();
    }

    private static void swapTwoElements(String[] arr, int a, int b) {
        String tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

}
