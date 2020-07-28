import java.io.*;

/**
 * Project: Java_Snippets
 * Author: AFIF AL MAMUN
 * Created in 7/28/20
 * Web: https://afifaniks.me
 */
public class Day_05_IO_P1_StrToText {
    String string;

    public Day_05_IO_P1_StrToText(String string) {
        this.string = string;
    }

    public void storeDataToFile(String storePath) {
        String[] countries = string.split("\\s{1,}");
        FileWriter printWriter = null;

        // Opening file stream
        try {
            printWriter = new FileWriter(new File(storePath));

            // Storing to file
            for (int i = 0; i < countries.length; i++) {
                char[] country = countries[i].trim().toCharArray();

                // Fixing first character if lowercase
                if (country[0] >= 'a' && country[0] <= 'z')
                    country[0] -= 32;

                printWriter.append(String.valueOf(country) + "\n");
            }
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void printDataFromFile(String filePath) {
        try {
            BufferedReader csvReader = new BufferedReader(new FileReader(filePath));
            String row;
            int ctr = 1;
            while ((row = csvReader.readLine()) != null) {
                System.out.println(ctr++ + ". " + row);
            }
            csvReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String dummyText = "Bangladesh India Bhutan  Russia china   mongolia  France Italy  Germany hungary  Turkey Egypt         Mexico Romania ethiopia   ";

        Day_05_IO_P1_StrToText strToText = new Day_05_IO_P1_StrToText(dummyText);
        strToText.storeDataToFile("ListOfCountries.txt");

        // Printing from File
        strToText.printDataFromFile("ListOfCountries.txt");
    }
}
