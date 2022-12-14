package date_time;

import utilities.ScannerHelper;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.time.LocalDate;

public class CalculateAge {
    public static void main(String[] args) throws ParseException {
        int userAge = ScannerHelper.getAnAge();
        System.out.println(LocalDate.now().getYear() - userAge);
        System.out.println(LocalDate.now().minusYears(userAge).getYear());
    }
}
