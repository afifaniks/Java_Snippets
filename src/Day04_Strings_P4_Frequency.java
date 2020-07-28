/**
 * Project: Java_Snippets
 * Author: AFIF AL MAMUN
 * Created in 7/27/20
 * Web: https://afifaniks.me
 */
public class Day04_Strings_P4_Frequency {
    String text;

    public Day04_Strings_P4_Frequency(String text) {
        this.text = text;
    }

    public void calculateFrequency() {
        char[] arr = this.text.toLowerCase().toCharArray();
        // Array to save character frequencies
        int[] frequency = new int[256];

        for (int i = 0; i < arr.length; i++) {
            frequency[arr[i]]++;
        }

        // Print data
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] != 0 && ((char)i >= 'a' && (char)i <= 'z')) {
                System.out.println((char)(i - 32) + ": " + frequency[i] + " times");
            }
        }
    }

    public static void main(String[] args) {
        String dummyText = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";

        Day04_Strings_P4_Frequency frequency = new Day04_Strings_P4_Frequency(dummyText);

        frequency.calculateFrequency();
    }
}
