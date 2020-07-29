import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Project: Java_Snippets
 * Author: AFIF AL MAMUN
 * Created in 7/29/20
 * Web: https://afifaniks.me
 */
public class Day_06_Regex_UsefulRegex {
    private static final String REGEX_NAME = "^[A-Z][A-Za-z ]+$";
    private static final String REGEX_PHONE = "\\d{11}";
    private static final String REGEX_EMAIL = "^[A-Za-z0-9\\.-]+@[\\w\\.]*\\.[A-Za-z0-9]+$";
    private static final String REGEX_URL = "^(https:\\/\\/|http:\\/\\/|www\\.)[\\w-\\.]+\\.[A-Za-z]+$";
    private static final String REGEX_DATE = "^(0?[1-9]|[12][0-9]|3[01])[-\\/](0?[1-9]|1[012])[-\\/]\\d{4}";
    private static final String REGEX_PASSWORD = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).*{6,30}";
    private Pattern pattern;
    private Matcher matcher;

    public Day_06_Regex_UsefulRegex() {
    }

    public void match(String string, String regex) {
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(string);

        System.out.println("Matches Found ");

        boolean matchesNotFound = true;

        while (matcher.find()) {
            matchesNotFound = false;
            System.out.println(matcher.group());
        }

        if (matchesNotFound)
            System.out.println("NULL\n");
        else
            System.out.println();
    }

    public static void main(String[] args) {
        String testName = "Afif Al Mamun";
        String testName2 = "Afif Al Mamun2";
        String testPhone = "01712777174 abcd";
        String testEmail = "afif.anik@gmail.com.bd";
        String testURL = "http://www.facebook.com";
        String testDate = "20/4/2098";
        String testPassword = "Ab27shgfaBAVD";
        String failPassword = "3628768273AAA";

        Day_06_Regex_UsefulRegex usefulRegex = new Day_06_Regex_UsefulRegex();

        usefulRegex.match(testName, REGEX_NAME);
        usefulRegex.match(testName2, REGEX_NAME);
        usefulRegex.match(testPhone, REGEX_PHONE);
        usefulRegex.match(testEmail, REGEX_EMAIL);
        usefulRegex.match(testURL, REGEX_URL);
        usefulRegex.match(testDate, REGEX_DATE);
        usefulRegex.match(testPassword, REGEX_PASSWORD);
        usefulRegex.match(failPassword, REGEX_PASSWORD);
    }
}
