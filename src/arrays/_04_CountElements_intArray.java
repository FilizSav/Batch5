package arrays;


import static java.lang.Integer.numberOfLeadingZeros;

public class _04_CountElements_intArray {
    public static void main(String[] args) {

        int[] numbers = {-1, 3, 0, 5, -7, 10, 8, 0, 10, 0};

        int negatives = 0;
        int positive = 0;
        int zero = 0;
        int even = 0;
        int odd = 0;
        int max = 0;
        int min = 0;
        int sum = 0;
        int average = 0;

        for (int number : numbers) {
            if(number > 0)
                positive ++;}

        System.out.println(positive);

        System.out.println("\n============== Task 1 =============\n");

        int counter = 0;
        for (int number : numbers) {
            if (number % 2 == 0) counter++;
        }
        System.out.println(counter);

        System.out.println("\n FOR I \n");

        int evenC = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2==0 ) evenC++;
        }
        System.out.println(evenC);
    }
}
