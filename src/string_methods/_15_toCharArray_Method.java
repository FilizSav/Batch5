package string_methods;

import java.util.Arrays;

public class _15_toCharArray_Method {
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

    }
}
