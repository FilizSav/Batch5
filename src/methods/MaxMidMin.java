package methods;

import utilities.MathHelper;
import utilities.RandomNumberGenerator;

public class MaxMidMin {
    public static void main(String[] args) {
        int num1 = RandomNumberGenerator.getARandomNumber(25, 35);
        int num2 = RandomNumberGenerator.getARandomNumber(25, 35);
        int num3 = RandomNumberGenerator.getARandomNumber(25, 35);

        System.out.println("Random 1 = " + num1);
        System.out.println("Random 2 = " + num2);
        System.out.println("Random 13 = " + num3);

        int max = MathHelper.maxOfThree(num1, num2,num3);
        int min = MathHelper.minOfThree(num1, num2,num3);

        System.out.println("The max is = " + max);
        System.out.println("The min is = " + min);

        System.out.println("The max is = " + MathHelper.maxOfThree(num1, num2,num3));
        System.out.println("The min is = " + MathHelper.minOfThree(num1, num2,num3));
        System.out.println("The middle is = " + MathHelper.midOfThree(num1, num2,num3));

        System.out.println(num1 + num2 + num3 - max - min + " MIDDLE NUMBER");

        System.out.println(MathHelper.mathMaxOfFour(1,9,2,7));

        System.out.println(MathHelper.isEven(5));
        System.out.println(MathHelper.isOdd(5));
        System.out.println(MathHelper.sum(2,3));

        }
    }
