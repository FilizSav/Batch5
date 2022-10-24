package arrays;


import java.util.Arrays;

public class SolvingArrays {
    public static void main(String[] args) {
     int[] numbers = {5, -1, 3, 10};
     String[] objects = {"remote", "computer", "Cup", "Phone"};

        System.out.println("\n=========before sort ========\n");

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(objects));

        System.out.println("\n=========after sort ========\n");

        Arrays.sort(numbers);
        Arrays.sort(objects);

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(objects));

    }
}
