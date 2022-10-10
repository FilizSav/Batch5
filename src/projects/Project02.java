package projects;

import java.util.Scanner;

public class Project02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("_______________Task1____________");
        int num1, num2, num3;

        System.out.println("Hey user can you enter 3 number?");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        num3 = scan.nextInt();
        scan.nextLine();
        System.out.println("The product of the numbers entered is = " + num1 * num2 * num3);

        System.out.println("_______________Task2____________");

        String firstname, lastname;
        int currentYear = 2022, birthYear;

        System.out.println("What is your first name?");
        firstname = scan.nextLine();

        System.out.println("What is your last name?");
        lastname = scan.nextLine();

        System.out.println("What is your year of birth?");
        birthYear = scan.nextInt();

        scan.nextLine();

        System.out.println(firstname + " " + lastname + "'s age is = " + (currentYear + -birthYear) + "." );

        System.out.println("_______________Task3____________");

        String fullName; float kgWeight;

        System.out.println("What is your full name?");
        fullName = scan.nextLine();

        System.out.println("How much do you weigh in kilos?");
        kgWeight = scan.nextFloat();

        System.out.println(fullName + "'s weight is = " + (kgWeight * 2.205) + " lbs.");

        System.out.println("_______________Task4____________");

        String student1, student2, student3; int age1,age2,age3, eldestAge, youngestAge;

        System.out.println("What is your full name?");
        student1 = scan.nextLine();

        System.out.println("What is your age? ");
        age1 = scan.nextInt();
        scan.nextLine();

        System.out.println("What is your full name?");
        student2 = scan.nextLine();

        System.out.println("What is your age?");
        age2 = scan.nextInt();
        scan.nextLine();
        System.out.println("What is your full name?");
        student3 = scan.nextLine();

        System.out.println("What is your age?");
        age3 = scan.nextInt();
        scan.nextLine();

        System.out.println(student1 + "'s age is "+ age1 +".\n"+ student2 + "'s age is "+ age2 +
                ".\n" +student3 + "'s age is "+ age3 +".\nThe average age is " +(age1+age2+age3)/3);

    }
}
