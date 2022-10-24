package loops.while_loops;

import utilities.RandomNumberGenerator;

import java.util.Scanner;

public class Exercise03_GuessingNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int random = RandomNumberGenerator.getARandomNumber(1,10);
        int num = 7;
        int attempt = 1;
        while ( random != num){
            System.out.println("The random number is = " + random);
            random = RandomNumberGenerator.getARandomNumber(1,10);
            attempt++;
        }
        System.out.println("It took " + attempt + " attempts to guess number!" );

    }
}
