package Lesson2;

public class Main {
    public static void main(String[] args) {
        int result = 0;
        String[][] array = {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        String[][] arraysize = {{"1", "2", "3", "4", "5"}, {"1", "2", "3", "4"}};
        String[][] arraydata = {{"1", "A", "3", "4"}, {"1", "2", "3", "4"}};

        System.out.println("Корректный массив");
        try {
            result = 0;
            result = analyze(array);
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Результат суммирования элементов массива = " + String.valueOf(result));
        }

        System.out.println("Некорректный массив");
        try {
            result = 0;
            result = analyze(arraysize);
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Результат суммирования элементов массива = " + String.valueOf(result));
        }

        System.out.println("Некорректный массив");
        try {
            result = 0;
            result = analyze(arraydata);
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Результат суммирования элементов массива = " + String.valueOf(result));
        }
    }

    public static int analyze(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int summ = 0;
        int value = 0;
        int row = 0;
        int cell = 0;

        if (array.length != 2 || array[0].length != 4 || array[1].length != 4) {
            String message = " - Массив другого размера";
            throw new MyArraySizeException(message);
        }

        for (int i = 1; i < 3; i++) {
            row = i;
            for (int c = 1; c < 5; c++) {
                cell = c;
                try {
                    value = Integer.parseInt(array[i - 1][c - 1]);
                    summ += value;
                } catch (IllegalArgumentException e) {
                    String message = " в " + String.valueOf(row) + " ряду, " + String.valueOf(cell) + " ячейке";
                    throw new MyArrayDataException(message);
                }
            }
        }
        return summ;
    }
}
