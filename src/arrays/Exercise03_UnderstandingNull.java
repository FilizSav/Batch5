package arrays;

import java.util.Arrays;

public class Exercise03_UnderstandingNull {
    public static void main(String[] args) {

      String s = "";

        System.out.println(s.toLowerCase());

      String[] objects = {"remote", "null", "", null};

        for (String object : objects) {
            System.out.println(object.toUpperCase());
        }
    }
}
