package enum_practices;

import java.time.DayOfWeek;
import java.time.Month;

public class TestCustomEnums {
    public static void main(String[] args) {


        for (Month m : Month.values()) {
            System.out.println(m);
        }

        for (Date d : Date.values()) {
            System.out.println(d);
        }
    }
}
