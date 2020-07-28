import java.io.*;

/**
 * Project: Java_Snippets
 * Author: AFIF AL MAMUN
 * Created in 7/28/20
 * Web: https://afifaniks.me
 */
public class Day_05_IO_CSV {
    String filePath;

    public Day_05_IO_CSV(String filePath) {
        this.filePath = filePath;
    }

    public void printCSV() {
        try {
            BufferedReader csvReader = new BufferedReader(new FileReader(filePath));
            String row;
            while ((row = csvReader.readLine()) != null) {
                String[] contents = row.split(",");

                for (int i = 0; i < contents.length; i++) {
                    System.out.printf(contents[i] + " ");
                }

                System.out.println();
            }
            csvReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeCSV(String row) {
        try {
            FileWriter printWriter = new FileWriter(new File(this.filePath), true);
            printWriter.append(row);
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Day_05_IO_CSV newCSV = new Day_05_IO_CSV("test.csv");

        String header = "ID,Name,Age\n";
        String entry1 = "1,Anik,20\n";
        String entry2 = "2,Bonik,30\n";

        newCSV.writeCSV(header);
        newCSV.writeCSV(entry1);
        newCSV.writeCSV(entry2);

        newCSV.printCSV();
    }
}
