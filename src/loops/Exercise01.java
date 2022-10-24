package loops;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter how many numbers you want to enter ");
        int enteredNumbers = scan.nextInt();

        int sum = 0;

        for (int i = 1; i <= enteredNumbers; i++) {
            System.out.println("Please enter number " + i);
            sum += scan.nextInt();
        }
        System.out.println(sum);
        System.out.println("----------------------------");


        System.out.println("Please enter how many numbers you want to enter ");
        int enteredNumberss = scan.nextInt();

        int start = 1;
        int sum2 = 0;

        while (start< enteredNumberss){
            System.out.println("Please enter number " + start);
            sum2 += scan.nextInt();
        }
        System.out.println(sum2);
    }
}
