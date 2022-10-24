package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class _01_StringArray {
    public static void main(String[] args) {

        // 1 -Declare a string array called countries size of three
        String[] countries = new String[3];

        //2 - Assigning values to specific index

        countries[1]= "Spain";
        countries[2]= "Belgium";


        //3 - Print a specific index from an array
        System.out.println(countries[0]);

        //4 - Printing an array
        System.out.println(Arrays.toString(countries));

        //5 - Updating existing element - call the variable and reassign value

        countries[1]= "France";
        System.out.println(Arrays.toString(countries));

        //6 - Getting the length of an array - how many elements - 3
        // int i = countries.length  than print i -- other way

        System.out.println(countries.length);

        //7 - Printing each element separately

        System.out.println(Arrays.toString(countries));

        for (int i = 0; i < countries.length; i++) {
            System.out.println(countries[i]);
        }
    }
}
