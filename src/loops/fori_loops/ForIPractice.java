package loops.fori_loops;

import utilities.RandomNumberGenerator;

public class ForIPractice {
    public static void main(String[] args) {

        System.out.println("Congrats");

        for (int i = 1; i <= 10; i++){
            System.out.println(i + " Congrats");
        }
        System.out.println("                    ");
        for (int i = 10; i > 0; i--) {
            System.out.println(i + " Congrats");
        }
        System.out.println("                    ");
        for (int i = 1; i <= 5; i++){
            System.out.println("Number " + i );
        }
        System.out.println("                    ");
        for (int i = 1, j = -1; i < 6 && j > -6; i++, j--) {
            System.out.println("Number: " + i);
            System.out.println("Number: " + j);
        }

        int random = RandomNumberGenerator.getARandomNumber(1,20);

        while (random != 7){
            random = RandomNumberGenerator.getARandomNumber(1,20);
            {if (random == 7)break;}
            System.out.println("Random number = " + random);
        }
        System.out.println("Congrats you got the number: " + random);
    }
}
