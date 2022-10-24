package string_methods;

import java.util.Arrays;

public class _16_split_Method {
    public static void main(String[] args) {
        /*
        - return type
        -return a char array
        - non-static call it by object
        - doesn't take argument
         */
        String s = "TechGlobal School";

        s.toCharArray(); // dont have to declare you can just use like below

        System.out.println(Arrays.toString(s.toCharArray()));

        String s1 = "Today is Sunday and the weather is nice";

        String[] arr = s1.split("is"); // puts in array

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(s1.split("is")));

    }
}