package mathClass;

import java.util.Scanner;

public class AbsValue {
    public static void main(String[] args) {
        // ABS Value

        System.out.println("Difference between your number is = " + Math.abs(10-14));
        System.out.println("Difference between your number is = " + Math.abs(14-10));
        System.out.println("Difference between your number is = " + (10-14));

        Scanner absValue = new Scanner(System.in);

        System.out.println("Please enter an age");
        int age = absValue.nextInt();

        System.out.println("Please enter another age");
        int age1 = absValue.nextInt();

        System.out.println("Difference between your age is " + Math.abs(age - age1));


    }
}
