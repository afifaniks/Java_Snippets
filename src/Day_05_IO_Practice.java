import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Project: Java_Snippets
 * Author: AFIF AL MAMUN
 * Created in 7/28/20
 * Web: https://afifaniks.me
 */
public class Day_05_IO_Practice {
    String fileName;

    public Day_05_IO_Practice(String fileName) {
        this.fileName = fileName;
    }

    public void readFile() {
        System.out.println("\nCurrent File Content\n");
        try {
            int ch;

            FileReader fileReader = new FileReader(this.fileName);
            while ((ch = fileReader.read())  != -1) {
                System.out.print((char)ch);
            }
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeFile(String text) {
        try {
            FileWriter fileWriter = new FileWriter(this.fileName);
            fileWriter.write(text);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void appendFile(String text) {
        try {
            FileWriter fileWriter = new FileWriter(this.fileName, true);
            fileWriter.append(text);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Day_05_IO_Practice file = new Day_05_IO_Practice("test.txt");
        file.writeFile("Write me in the file\nNOOOW");
        file.readFile();

        file.appendFile("Add this text");
        file.readFile();
    }
}
