package Lesson5;

import java.io.*;

public class AppData {
    private String[] header;
    private Integer[][] data;

    public void loadData(String fileName) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            header = bufferedReader.readLine().split(";");
            data = new Integer[countLines(fileName)-1][header.length];
            String tempString;
            for (int i = 0; i < data.length ; i++) {
                tempString = bufferedReader.readLine();
                for (int j = 0; j < data[i].length; j++) {
                    data[i][j] = Integer.parseInt(tempString.split(";")[j]);
                }
            }
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private int countLines(String fileName) {
        int i = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            while ((bufferedReader.readLine()) != null) {
                i++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return i;
    }

    public void saveData(String fileName) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName))) {
            bufferedWriter.write(rowToString(header));
            for (Integer[] intRow : data) {
                bufferedWriter.write(rowToString(intRow));
            }
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public String[] getHeader() {
        return header;
    }

    public Integer[][] getData() {
        return data;
    }

    private <T> String rowToString(T[] row) {
        String result = "";
        for (int i = 0; i < row.length; i++) {
            result = result + row[i].toString();
            if (i != row.length - 1) {
                result += ";";
            }
        }

        return result;
    }
}
