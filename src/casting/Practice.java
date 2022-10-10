package casting;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        int num1 = 5, num2 = 2;

        System.out.println(num1 / num2); // 5 / 2 = 2
        System.out.println((double) num1 / num2); // 5.0 / 2 = 2.5
        System.out.println(num1 / (double) num2); // 5 / 2.0 = 2.5
        System.out.println((double) (num1 / num2)); // (double)(5 / 2) = 2.0
        System.out.println((double) num1 / (double) num2); // 5.0 / 2.0 = 2.5

        Scanner scan = new Scanner(System.in);

        double price = 600;

        System.out.println("The price for the PS5 is currently = $" + price);
        System.out.println("How much are you saving daily");
        double dailySave = scan.nextDouble();

        System.out.println("You can buy a PS5 in " + (int)(price / dailySave) + " days");

        String salary1 = "5000";
        String salary2 = "6000.25";
        String salary3 = "4000.50";

        double d1 = Double.parseDouble(salary1);
        double d2 = Double.parseDouble(salary2);
        double d3 = Double.parseDouble(salary3);

        System.out.println("Min salary = $" + Math.min(Math.min(d1,d2),d3)*.10) ;
        System.out.println("Max salary = $" + Math.max(Math.max(d1,d2),d3));

    }

}
