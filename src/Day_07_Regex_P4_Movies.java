import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Project: Java_Snippets
 * Author: AFIF AL MAMUN
 * Created in 8/3/20
 * Web: https://afifaniks.me
 */
public class Day_07_Regex_P4_Movies {
    String regex;
    Pattern pattern;

    public Day_07_Regex_P4_Movies(String regex) {
        this.regex = regex;
        pattern = Pattern.compile(regex);
    }

    public void extractData(String string) {
        Matcher matcher = pattern.matcher(string);
        String match = "";
        int column = 0;

        while (matcher.find()) {
            switch (column){
                case 0:
                    System.out.println("Movie Name: " + matcher.group(3));
                    break;
                case 1:
                    System.out.println("Distributor: " + matcher.group(3));
                    break;
                case 2:
                    System.out.println("Domestic Gross: " + matcher.group(3));
                    break;
            }

            column++;

            if (column == 3) {
                column = 0;
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        String text = "<table class=\"wikitable\" style=\"margin:auto; margin:auto;\">\n" +
                "<caption>Highest-grossing films of 2020\n" +
                "</caption>\n" +
                "<tbody><tr>\n" +
                "<th>Rank</th>\n" +
                "<th>Title</th>\n" +
                "<th>Distributor</th>\n" +
                "<th>Domestic gross\n" +
                "</th></tr>\n" +
                "\n" +
                "<tr style=\"text-align:left;\">\n" +
                "<th style=\"text-align:center;\">1\n" +
                "</th>\t\n" +
                "<td><i><a href=\"/wiki/Bad_Boys_for_Life\" title=\"Bad Boys for Life\">Bad Boys for Life</a></i>*\n" +
                "</td>\n" +
                "<td><a href=\"/wiki/Sony_Pictures_Motion_Picture_Group#Sony_Pictures_Releasing\" class=\"mw-redirect\" title=\"Sony Pictures Motion Picture Group\">Sony</a>\n" +
                "</td>\n" +
                "<td>$204,417,855\n" +
                "</td></tr>\n" +
                "\n" +
                "<tr style=\"text-align:left;\">\n" +
                "<th style=\"text-align:center;\">2\n" +
                "</th>\n" +
                "<td><i><a href=\"/wiki/Sonic_the_Hedgehog_(film)\" title=\"Sonic the Hedgehog (film)\">Sonic the Hedgehog</a></i>*\n" +
                "</td>\n" +
                "<td><a href=\"/wiki/Paramount_Pictures\" title=\"Paramount Pictures\">Paramount</a>\n" +
                "</td>\n" +
                "<td>$146,066,470\n" +
                "</td></tr>\n" +
                "\n" +
                "<tr style=\"text-align:left;\">\n" +
                "<th style=\"text-align:center;\">3\n" +
                "</th>\n" +
                "<td><i><a href=\"/wiki/Birds_of_Prey_(2020_film)\" title=\"Birds of Prey (2020 film)\">Birds of Prey</a></i>*\n" +
                "</td>\n" +
                "<td><a href=\"/wiki/Warner_Bros.\" title=\"Warner Bros.\">Warner Bros.</a>\n" +
                "</td>\n" +
                "<td>$84,158,461\n" +
                "</td></tr>\n" +
                "\n" +
                "<tr style=\"text-align:left;\">\n" +
                "<th style=\"text-align:center;\">4\n" +
                "</th>\n" +
                "<td><i><a href=\"/wiki/Dolittle_(film)\" title=\"Dolittle (film)\">Dolittle</a></i>*\n" +
                "</td>\n" +
                "<td rowspan=\"2\"><a href=\"/wiki/Universal_Pictures\" title=\"Universal Pictures\">Universal</a>\n" +
                "</td>\n" +
                "<td>$77,047,065\n" +
                "</td></tr>\n" +
                "\n" +
                "<tr style=\"text-align:left;\">\n" +
                "<th style=\"text-align:center;\">5\n" +
                "</th>\n" +
                "<td><i><a href=\"/wiki/The_Invisible_Man_(2020_film)\" title=\"The Invisible Man (2020 film)\">The Invisible Man</a></i>*\n" +
                "</td>\n" +
                "<td><a href=\"/wiki/20th_Century_Studios\" title=\"20th Century Studios\">Universal</a>\n" +
                "</td>\n" +
                "<td>$64,914,050\n" +
                "</td></tr>\n" +
                "\n" +
                "<tr style=\"text-align:left;\">\n" +
                "<th style=\"text-align:center;\">6\n" +
                "</th>\n" +
                "<td><i><a href=\"/wiki/The_Call_of_the_Wild_(2020_film)\" title=\"The Call of the Wild (2020 film)\">The Call of the Wild</a></i>*\n" +
                "</td>\n" +
                "<td><a href=\"/wiki/20th_Century_Studios\" title=\"20th Century Studios\">20th Century Studios</a>\n" +
                "</td>\n" +
                "<td>$62,342,368\n" +
                "</td></tr>\n" +
                "\n" +
                "<tr style=\"text-align:left;\">\n" +
                "<th style=\"text-align:center;\">7\n" +
                "</th>\n" +
                "<td><i><a href=\"/wiki/Onward_(film)\" title=\"Onward (film)\">Onward</a></i>*\n" +
                "</td>\n" +
                "<td><a href=\"/wiki/Walt_Disney_Studios_Motion_Pictures\" title=\"Walt Disney Studios Motion Pictures\">Disney</a>\n" +
                "</td>\n" +
                "<td>$61,555,145\n" +
                "</td></tr>\n" +
                "\n" +
                "<tr style=\"text-align:left;\">\n" +
                "<th style=\"text-align:center;\">8\n" +
                "</th>\n" +
                "<td><i><a href=\"/wiki/The_Gentlemen_(2019_film)\" title=\"The Gentlemen (2019 film)\">The Gentlemen</a></i>*\n" +
                "</td>\n" +
                "<td><a href=\"/wiki/STX_Entertainment\" title=\"STX Entertainment\">STX Films</a>\n" +
                "</td>\n" +
                "<td>$36,296,853\n" +
                "</td></tr>\n" +
                "\n" +
                "<tr style=\"text-align:left;\">\n" +
                "<th style=\"text-align:center;\">9\n" +
                "</th>\n" +
                "<td><i><a href=\"/wiki/Fantasy_Island_(film)\" title=\"Fantasy Island (film)\">Fantasy Island</a></i>*\n" +
                "</td>\n" +
                "<td>Sony\n" +
                "</td>\n" +
                "<td>$26,441,782\n" +
                "</td></tr>\n" +
                "\n" +
                "<tr style=\"text-align:left;\">\n" +
                "<th style=\"text-align:center;\">10\n" +
                "</th>\n" +
                "<td><i><a href=\"/wiki/Like_a_Boss_(film)\" title=\"Like a Boss (film)\">Like a Boss</a></i>*\n" +
                "</td>\n" +
                "<td>Paramount\n" +
                "</td>\n" +
                "<td>$22,169,514\n" +
                "</td></tr></tbody></table>";


        String regexToGetTD = "<td.*?>(<.*?>)?(<.*?>)?([A-Za-z0-9$, ]+)";

        Day_07_Regex_P4_Movies movies = new Day_07_Regex_P4_Movies(regexToGetTD);
        movies.extractData(text);

    }
}
