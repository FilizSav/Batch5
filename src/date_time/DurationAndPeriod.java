package date_time;

import utilities.ScannerHelper;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DurationAndPeriod {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        LocalDate dateOfBirth = LocalDate.of(1980, Month.OCTOBER,24);

        System.out.println(today);
        System.out.println(dateOfBirth);

        System.out.println(Period.between(dateOfBirth,today).getYears());
        System.out.println(Period.between(dateOfBirth,today).getMonths());
        System.out.println(Period.between(dateOfBirth,today).getDays());

        //Chronounit

        System.out.println(ChronoUnit.YEARS.between(dateOfBirth, today));
        System.out.println(ChronoUnit.MONTHS.between(dateOfBirth, today));
        System.out.println(ChronoUnit.WEEKS.between(dateOfBirth, today));
        System.out.println(ChronoUnit.DAYS.between(dateOfBirth, today));

    }
}
