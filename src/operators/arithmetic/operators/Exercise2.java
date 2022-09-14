package operators.arithmetic.operators;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

       /* double pay = 90_000;

        System.out.println("Annual pay for SDET is =" + "$" +pay);
        System.out.println("Monthly pay for SDET is =" + "$" +pay/12);
        System.out.println("Bi-weekly pay for SDET is =" + "$" +pay/26);
        System.out.println("Weekly pay for SDET is =" + "$" +pay/52);

        */

        Scanner scan = new Scanner(System.in);

        double yearlySalary;

        System.out.println("What is your yearly salary?");
        double yearly= scan.nextDouble();
        System.out.println("Your monthly payment is $" + yearly / 12 +" then");






    }
}
