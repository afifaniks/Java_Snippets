import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Project: Java_Snippets
 * Author: AFIF AL MAMUN
 * Created in 7/29/20
 * Web: https://afifaniks.me
 */
public class Day_06_Regex_FindMatch {
    String regex;
    Pattern pattern;
    Matcher matcher;

    public Day_06_Regex_FindMatch(String regex) {
        this.regex = regex;
        pattern = Pattern.compile(regex);
    }

    public void firstMatch(String str) {
        matcher = pattern.matcher(str);

        System.out.println("First Match");
        if (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    public void multipleMatches(String str) {
        matcher = pattern.matcher(str);

        System.out.println("Multiple Matches");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    public static void main(String[] args) {
        String str = "<strong>ABC</strong>123<strong>DEF</strong>AZZZZ<strong>";
        //Extracting values inside tags
        String regex = "(?<=>)\\w+(?=<)";

        Day_06_Regex_FindMatch findMatch = new Day_06_Regex_FindMatch(regex);

        findMatch.firstMatch(str);
        findMatch.multipleMatches(str);

    }
}
