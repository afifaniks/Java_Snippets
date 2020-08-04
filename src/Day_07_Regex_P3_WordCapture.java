import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Project: Java_Snippets
 * Author: AFIF AL MAMUN
 * Created in 8/3/20
 * Web: https://afifaniks.me
 */
public class Day_07_Regex_P3_WordCapture {
    String regex;

    public Day_07_Regex_P3_WordCapture (String regex) {
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
        // Part {a}
        String regex = "\\w{5}";
        String words[] = {"aPPle", "Apppple", "Ape"};

        System.out.println("Part {a}");
        for (String w:
             words) {
            System.out.println(new Day_07_Regex_P3_WordCapture(regex).doesMatch(w));
        }

        // Part {b}
        String regex2 = "\\w{3,8}";
        String words2[] = {"abcdefgh", "abcdefghi", "ab"};

        System.out.println("\nPart {b}");
        for (String w:
                words2) {
            System.out.println(new Day_07_Regex_P3_WordCapture(regex2).doesMatch(w));
        }

        // Part {c}
        String regex3 = "(?<=https\\/\\/www.|www.)\\w+(?=\\.[A-Za-z\\.0-9]+)";
        String words3[] = {"https://www.google.com.bd", "www.facebpook.com", "www.nosite."};

        System.out.println("\nPart {c}");
        for (String w:
                words3) {
            new Day_07_Regex_P3_WordCapture(regex3).find(w);
        }

        // Part {d}
        String regex4 = "^[A-Za-z0-9\\.-]+@[\\w\\.]*\\.[A-Za-z0-9]+$";
        String words4[] = {"john.adams@sebpo.com", "johnadams@gmail.com", "asdaasfa@com@house.com"};

        System.out.println("\nPart {d}");
        for (String w:
                words4) {
            System.out.println(new Day_07_Regex_P3_WordCapture(regex4).doesMatch(w));
        }

    }
}
