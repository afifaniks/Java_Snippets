import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Project: Java_Snippets
 * Author: AFIF AL MAMUN
 * Created in 7/28/20
 * Web: https://afifaniks.me
 */
public class Day_05_IO_P2_XLSHandler {
    String filePath;
    FileInputStream fileInputStream;
    HSSFWorkbook workbook;
    HSSFSheet sheet;

    public Day_05_IO_P2_XLSHandler(String filePath) {
        this.filePath = filePath;
        try {
            fileInputStream = new FileInputStream(new File(filePath));
            workbook = new HSSFWorkbook(fileInputStream);
            sheet = workbook.getSheetAt(0); // Getting first sheet
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void printRowWise() {
        boolean avoidFirstRow = true;
        for (Row row: sheet) {

            if (avoidFirstRow) {
                avoidFirstRow = false;
                continue;
            }

            Cell cell = row.getCell(0);
            Cell cell2 = row.getCell(1);
            Cell cell3 = row.getCell(2);
            Cell cell4 = row.getCell(3);

            String firstName = "";
            String lastName = "";
            String country = "";
            String gender = "";

            if (cell != null) {
                firstName = cell.getStringCellValue();
            }

            if (cell2 != null) {
                lastName = cell2.getStringCellValue();
            }

            if (cell3 != null) {
                country = cell3.getStringCellValue();
            }

            if (cell4 != null) {
                gender = cell4.getStringCellValue();
            }

            System.out.println("First Name: " + firstName);
            System.out.println("Last Name: " + lastName);
            System.out.println("Full Name: " + firstName + " " + lastName);
            System.out.println("Country: " + country);
            System.out.println("Gender: " + gender);
            System.out.println();
        }
    }

    public void printColumnWise() {
        ArrayList<String> firstName = new ArrayList<>();
        ArrayList<String> lastName = new ArrayList<>();
        ArrayList<String> country = new ArrayList<>();
        ArrayList<String> gender = new ArrayList<>();

        boolean avoidFirst = true;

        for (Row row: sheet) {
            if (avoidFirst) {
                avoidFirst = false;
                continue;
            }

            Cell cell = row.getCell(0);
            if (cell != null)
                firstName.add(cell.getStringCellValue());
            else firstName.add(" ");

            cell = row.getCell(1);
            if (cell != null)
                lastName.add(cell.getStringCellValue());
            else lastName.add(" ");

            cell = row.getCell(2);
            if (cell != null)
                country.add(cell.getStringCellValue());
            else country.add(" ");

            cell = row.getCell(3);
            if (cell != null)
                gender.add(cell.getStringCellValue());
            else gender.add(" ");

        }

        System.out.println("1st Column = First Name");
        for (String name: firstName) {
            System.out.println(name);
        }

        System.out.println("2nd Column = Last Name");
        for (String name: lastName) {
            System.out.println(name);
        }

        System.out.println("3rd Column = Country");
        for (String c: country) {
            System.out.println(c);
        }

        System.out.println("4th Column = Gender");
        for (String g: gender) {
            System.out.println(g);
        }
    }

    public static void main(String[] args) {
        String path = "data/Data1.xls";

        Day_05_IO_P2_XLSHandler xlsHandler = new Day_05_IO_P2_XLSHandler(path);

        xlsHandler.printRowWise();
        xlsHandler.printColumnWise();
    }
}
