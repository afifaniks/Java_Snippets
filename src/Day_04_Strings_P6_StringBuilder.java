/**
 * Project: Java_Snippets
 * Author: AFIF AL MAMUN
 * Created in 7/27/20
 * Web: https://afifaniks.me
 */
public class Day_04_Strings_P6_StringBuilder {
    StringBuilder stringBuilder = new StringBuilder();

    public void append(String str) {
        stringBuilder.append(str);
    }

    public void print() {
        System.out.println("Current String: " + stringBuilder.toString());
    }

    public static void main(String[] args) {
        Day_04_Strings_P6_StringBuilder sb = new Day_04_Strings_P6_StringBuilder();

        sb.print();

        // Appending text
        sb.append("Line 1");
        sb.print();

        // Append again
        sb.append("New Line 2");
        sb.print();
    }
}
