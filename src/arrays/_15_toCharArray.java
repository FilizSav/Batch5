package arrays;

import java.util.Arrays;

public class _15_toCharArray {
    public static void main(String[] args) {

        String s = "Java";
         char[] chars = s.toCharArray();


        System.out.println(Arrays.toString(chars));

        int counterA = 0;

        for (char aChar : chars) {
            if(aChar == 'a')counterA++;

        }
        System.out.println(counterA);
    }
}
