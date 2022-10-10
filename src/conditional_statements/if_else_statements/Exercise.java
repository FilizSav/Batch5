package conditional_statements.if_else_statements;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println(" Hey David! Please enter your math grade?");
        int examResult = scan.nextInt();
         if (examResult >= 60){
             System.out.println("Awesome! You passed the math class!");
         }
         else{
             System.out.println("Sorry! You failed!");
         }
        System.out.println(" Hey user please enter a number?");
        int oddEven = scan.nextInt();
        if (oddEven % 2==0){
            System.out.println("The number entered is even!");
        }
        else{
            System.out.println("The number you entered is odd!");
        }
    }
}
