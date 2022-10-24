package loops.do_while_loops;

import java.util.Scanner;

public class Exercise01_GetNumberBy5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = scan.nextInt();

        while (num % 5 != 0) {
            System.out.println("This number is not dividable by 5");
            System.out.println("Please enter a new number");
            num = scan.nextInt();
        }
        System.out.println("This number is dividable by 5");
        System.out.println("----------------DoWhile___________");
        int number;

        do{
            System.out.println("Please enter a number");
            number = scan.nextInt();
            if(number % 5 != 0) System.out.println("This number is not dividable by 5");
        } while(number % 5 != 0);
        System.out.println("This number is dividable by 5");

        System.out.println("----------------fori---------------");



    }
}
