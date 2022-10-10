package practice.methods;

public class ReturnMethodPractices {

    public static void checkCreditScore(double balance) {
        if (balance >= 0.00 && balance < 1000.00) {
            System.out.println("Low credit score");
        } else if (balance >= 1000.00 && balance < 2000.00) {
            System.out.println("Medium credit score");
        } else if (balance >= 2000.00 && balance < 3000.00) {
            System.out.println("Good credit score");
        } else {
            System.out.println("No valid credit score!");
        }
    }
}