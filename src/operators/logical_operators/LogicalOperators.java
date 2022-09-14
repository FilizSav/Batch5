package operators.logical_operators;

import java.sql.SQLOutput;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean b1 = 3 < 5;
        boolean b2 = 5 != 5;
        boolean b3 = 2 == 2;
        boolean b4 = b1 || b2 || b3;
        boolean b5 = b1 && b2 && b3;

        System.out.println(b1);
        System.out.println(!b1);

        System.out.println(!b2 && b1 || b3);// !false = true value \\ !true = false value

        int hour = 13;

        if (hour >=6 && hour <= 12) System.out.println("Good Morning");
        else if (hour >= 13 && hour<=20) System.out.println("Good Afternoon");
        else if (hour >= 21 && hour<=24) System.out.println("Good Night");
        }

    }
