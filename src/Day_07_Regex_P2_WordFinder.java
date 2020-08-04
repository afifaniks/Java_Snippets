import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Project: Java_Snippets
 * Author: AFIF AL MAMUN
 * Created in 8/3/20
 * Web: https://afifaniks.me
 */
public class Day_07_Regex_P2_WordFinder {
    String regex;

    public Day_07_Regex_P2_WordFinder(String regex) {
        this.regex = regex;
    }

    public boolean doesMatch(String string) {
        return Pattern.matches(regex, string);
    }

    public void find(String string) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    public static void main(String[] args) {
        // Part (a)
        String regex = "[A-Za-z0-9_]*";
        String words[] = {"JohN9_MiChaEl*", "John_Michael"};

        System.out.println("Part (a)");
        for (String word:
             words) {
            System.out.println(new Day_07_Regex_P2_WordFinder(regex).doesMatch(word));
        }

        // Part (b)
        String regex2 = "0\\d*";
        String words2[] = {"0123456", "125200"};

        System.out.println("\nPart (b)");
        for (String word:
                words2) {
            System.out.println(new Day_07_Regex_P2_WordFinder(regex2).doesMatch(word));
        }

        // Part (c)
        String regex3 = "(0?[1-9]|[12][0-9]|3[0-2])\\/([0-9]|1[0-2])\\/\\d{4}";
        String words3[] = {"John McKinskey Alamard, 21 East Avenue,  02/12/2012", "Boom 12/33/2019"};

        System.out.println("\nPart (c)");
        for (String word:
                words3) {
            new Day_07_Regex_P2_WordFinder(regex3).find(word);
        }

    }
}
