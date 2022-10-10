package utilities;

public class MathHelper {

    public static int maxOfThree(int num1, int num2, int num3) {
        return Math.max(Math.max(num1, num2), num3);
    }

    public static int minOfThree(int num1, int num2, int num3) {
        return Math.min(Math.min(num1, num2), num3);
    }

    public static int midOfThree(int num1, int num2, int num3) {
        int max = maxOfThree(num1, num2, num3);
        int min = minOfThree(num1, num2, num3);

        if (num1 != min && num1 != max) return num1;
        else if (num2 != min && num2 != max) return num2;
        else return num3;
    }

    public static int mathMaxOfFour(int num1, int num2, int num3, int num4) {
        int mathMax = Math.max(Math.max(num1, num2), (Math.max(num3, num4)));

        return mathMax;
    }

    public static boolean isEven(int num1) {
        boolean isEven = num1 % 2 == 0;
        return isEven;
    }

    public static boolean isOdd(int num1) {
        return num1 % 2 == 1;
    }

    public static int sum(int num1, int num2) {
        return (num1 + num2);
    }

}
