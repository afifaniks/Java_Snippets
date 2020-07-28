/**
 * Project: Java_Snippets
 * Author: AFIF AL MAMUN
 * Created in 7/27/20
 * Web: https://afifaniks.me
 */
public class Day_04_Strings_P2_Contains {
    String text;

    public Day_04_Strings_P2_Contains(String text) {
        this.text = text;
    }

    public boolean hasMatch(String data) {
        // Making Case Insensitive
        return text.toLowerCase().contains(data.toLowerCase());
    }

    public static void main(String[] args) {
        String str1 = "Honda Porsche Mercedes Ford BMW Bentley Bugatti Toyota Audi Mazda Volswagen Lamborgini Renault Volvo";
        Day_04_Strings_P2_Contains object = new Day_04_Strings_P2_Contains(str1);

        String[] items = {"honda", "lexus", "mazda", "bentley", "hyundai", "jeep", "chevrolet"};

        for (int i = 0; i < items.length; i++) {
            System.out.println("Item " + (i + 1) + ": " + items[i]);
            System.out.println("Inside Original String: " + object.hasMatch(items[i]));
        }

    }
}
