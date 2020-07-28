import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Project: Java_Snippets
 * Author: AFIF AL MAMUN
 * Created in 7/28/20
 * Web: https://afifaniks.me
 */
public class Day_05_Regex_Practice {
    private Pattern pattern;
    private Matcher matcher;

    public Day_05_Regex_Practice(String regex) {
        pattern = Pattern.compile(regex);
    }

    public boolean match(String string) {
        matcher = pattern.matcher(string);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String regex = "[^AP][0-9]{2,}";

        Day_05_Regex_Practice regex_practice = new Day_05_Regex_Practice(regex);

        System.out.println(regex_practice.match("B00"));
    }
}
