/**
 * Project: Java_Snippets
 * Author: AFIF AL MAMUN
 * Created in 7/27/20
 * Web: https://afifaniks.me
 */
public class Day04_Strings_P1_Split {
    String text;
    String[] textToArr;

    public Day04_Strings_P1_Split(String text) {
        textToArr = text.split(",");

        // Trimming extra spaces
        for (int i = 0; i < textToArr.length; i++) {
            textToArr[i] = textToArr[i].trim().replaceAll("\\s+", " ");
        }
    }

    public void printAll() {
        for (int i = 0; i < textToArr.length; i++) {
            System.out.println("Cricketer " + (i + 1) + " - " + textToArr[i]);
        }
    }

    public static void main(String[] args) {
        String cricketPlayers = "Shakib  Al Hasan, Tamim  Iqbal, Mashrafe Mortaza, Mushfiqur    Rahim, Liton Das, Rubel  Hossain";
        Day04_Strings_P1_Split splitter = new Day04_Strings_P1_Split(cricketPlayers);

        splitter.printAll();
    }
}
