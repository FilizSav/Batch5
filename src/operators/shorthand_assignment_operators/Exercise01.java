package operators.shorthand_assignment_operators;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
/*Balance after 1st transaction = $74.25
Balance after 2nd transaction = $61.75
Balance after 3rd transaction = $54.5
•Balance = $100.00•1st transaction = $25.75 •2nd transaction =  $12.50*/
/*        double balance, firstTransaction, secondTransaction, thirdTransaction;

        System.out.println("Hey user, please enter your balance:");
        balance = scan.nextDouble();
        System.out.println("Now, please tell your first transaction:");
        firstTransaction = scan.nextDouble();
        balance-= firstTransaction;
        System.out.println("Balance after first transaction is = $" +balance);
        System.out.println("Well, how about your second transaction:");
        secondTransaction = scan.nextDouble();
        balance -=secondTransaction;
        System.out.println("Balance after 2nd transaction is = $" +balance);
        System.out.println("Well, how about the 3rd transaction = ");
        thirdTransaction = scan.nextDouble();
        balance-=thirdTransaction;
        System.out.println("Balance after 3rd transaction is = $" +balance);
*/
        int i = 5;

        int age = 10 * (i++); //50  int age = 10 * i;

        i = i + 1;

        int p = 5;
        int look = 10 * (++i); //60 i = i + 1;
        System.out.println(age);
        System.out.println(look);
    }
}
