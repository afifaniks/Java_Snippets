import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Project: Java_Snippets
 * Author: AFIF AL MAMUN
 * Created in 8/3/20
 * Web: https://afifaniks.me
 */
public class Day_07_Regex_P1_CharacterMatch {
    String regex;

    public Day_07_Regex_P1_CharacterMatch(String regex) {
        this.regex = regex;
    }

    public boolean doesMatch(String string) {
        return Pattern.matches(regex, string);
    }

    public static void main(String[] args) {

        // Part (a)
        System.out.println("Part (a)");
        String regex = "[Pp][A-Za-z]*[Pp]";
        String word[] = {"poop", "pop", "pod", "dop", "PP"};

        for (String str: word) {
            System.out.println(new Day_07_Regex_P1_CharacterMatch(regex).doesMatch(str));
        }

        // Part (b)
        System.out.println("\nPart (b)");
        String regex2 = "[^oO][A-Za-z]*[^oO]";
        String word2[] = {"Owl", "lwo", "bowl", "oOoOOoO", "PP"};

        for (String str: word2) {
            System.out.println(new Day_07_Regex_P1_CharacterMatch(regex2).doesMatch(str));
        }

        // Part (c)
        System.out.println("\nPart (c)");
        String regex3 = ".*[AEIOUaeiou].*";
        String word3[] = {"vowel", "bxxxx", "xlpo", "linux", "bbvl", "goat"};

        for (String str: word3) {
            System.out.println(new Day_07_Regex_P1_CharacterMatch(regex3).doesMatch(str));
        }


    }
}
