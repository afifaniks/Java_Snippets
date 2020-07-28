/**
 * Project: Java_Snippets
 * Author: AFIF AL MAMUN
 * Created in 7/27/20
 * Web: https://afifaniks.me
 */
public class Day04_Strings_P3_Cleaner {
    String originalText;

    public Day04_Strings_P3_Cleaner(String originalText) {
        this.originalText = originalText;
    }

    public String fixText(String currentText, String targetText) {
        return originalText.trim().replace(currentText, targetText);
    }

    public static void main(String[] args) {
        String extractedText = " 123/I New Boston Rood, Boston - 12132   ";

        Day04_Strings_P3_Cleaner cleaner = new Day04_Strings_P3_Cleaner(extractedText);

        String cleanedText = cleaner.fixText("Rood", "Road");

        System.out.println("Cleaned Data:\n" + cleanedText);

    }
}
