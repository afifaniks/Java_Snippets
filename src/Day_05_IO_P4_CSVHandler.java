import java.io.*;
import java.util.ArrayList;

/**
 * Project: Java_Snippets
 * Author: AFIF AL MAMUN
 * Created in 7/28/20
 * Web: https://afifaniks.me
 */
public class Day_05_IO_P4_CSVHandler {
    String filePath;
    BufferedReader csvReader;

    public Day_05_IO_P4_CSVHandler(String filePath) {
        this.filePath = filePath;
    }

    public void printRowWise() {
        try {
            csvReader = new BufferedReader(new FileReader(filePath));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        boolean avoidFirstRow = true;

        String row;

        try {
            while ((row = csvReader.readLine()) != null) {
                String[] contents = row.split(",");

                if (avoidFirstRow) {
                    avoidFirstRow = false;
                    continue;
                }

                System.out.println("First Name: " + contents[0]);
                System.out.println("Last Name: " + contents[1]);
                System.out.println("Full Name: " + contents[0] + " " + contents[1]);
                System.out.println("Country: " + contents[2]);
                System.out.println("Gender: " + contents[3]);
                System.out.println();
            }

            csvReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void printColumnWise() {
        try {
            csvReader = new BufferedReader(new FileReader(filePath));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        ArrayList<String> firstName = new ArrayList<>();
        ArrayList<String> lastName = new ArrayList<>();
        ArrayList<String> country = new ArrayList<>();
        ArrayList<String> gender = new ArrayList<>();

        boolean avoidFirstRow = true;

        String row;

        try {
            while ((row = csvReader.readLine()) != null) {
                String[] contents = row.split(",");

                if (avoidFirstRow) {
                    avoidFirstRow = false;
                    continue;
                }

                firstName.add(contents[0]);
                lastName.add(contents[1]);
                country.add(contents[2]);
                gender.add(contents[3]);
            }

            csvReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("1st Column = First Name");
        for (String name: firstName) {
            System.out.println(name);
        }

        System.out.println("2nd Column = Last Name");
        for (String name: lastName) {
            System.out.println(name);
        }

        System.out.println("3rd Column = Country");
        for (String c: country) {
            System.out.println(c);
        }

        System.out.println("4th Column = Gender");
        for (String g: gender) {
            System.out.println(g);
        }
    }

    public static void main(String[] args) {
        String path = "data/Data3.csv";

        Day_05_IO_P4_CSVHandler csvHandler = new Day_05_IO_P4_CSVHandler(path);

        csvHandler.printRowWise();
        csvHandler.printColumnWise();
    }
}
