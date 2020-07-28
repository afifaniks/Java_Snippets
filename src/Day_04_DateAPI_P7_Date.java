import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

/**
 * Project: Java_Snippets
 * Author: AFIF AL MAMUN
 * Created in 7/27/20
 * Web: https://afifaniks.me
 */
public class Day_04_DateAPI_P7_Date {
    Date currentDate;
    DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

    public Day_04_DateAPI_P7_Date() {
        currentDate = new Date();
    }

    public void currentDate() {
        System.out.println("Current Date: " + dateFormat.format(currentDate));
    }

    /***
     * Inputs mm/dd/yyyy date and compares it to current date
     * @param date: Input
     * @return Integer: Negative if current date is newer, equal if same, positive otherwise
     */
    public Integer compareDate(String date) {
        DateFormat newDateFormat = new SimpleDateFormat("yyyy/MM/dd");

        try {
            Date inputDate = dateFormat.parse(date);
            String today = newDateFormat.format(currentDate);
            String inp = newDateFormat.format(inputDate);
            return inp.compareTo(today);
        } catch (ParseException e) {
            e.printStackTrace();
        }
       return null;
    }

    public static void main(String[] args) {
        Day_04_DateAPI_P7_Date date = new Day_04_DateAPI_P7_Date();

        date.currentDate();

        String date1 = "03/22/1993";
        String date2 = "07/19/2022";
        String date3 = "01/01/2010";
        String date4 = "07/27/2020";

        int result = date.compareDate(date2);

        if (result < 0) {
            System.out.println("PAST");
        } else if (result == 0) {
            System.out.println("PRESENT");
        } else {
            System.out.println("FUTURE");
        }
    }

//    public void compareDate(String date) {
//        LocalDate localDate = dateFormat.format(date);
//    }
}
