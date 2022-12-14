package date_time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatDate {

    public static void main(String[] args) {

        System.out.println("\n-----------Formatting Date-------------\n");
        Date date = new Date();
        System.out.println(date);

        SimpleDateFormat formatt = new SimpleDateFormat("MM/dd/yyyy");
        formatt = new SimpleDateFormat("yyyy");
        System.out.println(formatt.format(date));
        System.out.println(formatt.format(date));



    }
}
