package arrays;

import java.util.Arrays;

public class _05_charArray {
    public static void main(String[] args) {

        System.out.println("\n============== Task 1 =============\n");

        char[] characters = {'#','$','5','A','b','H'};
        System.out.println(Arrays.toString(characters));

        System.out.println("\n============== Task 2 =============\n");

        System.out.println("The size of the array is = "+ characters.length);

        System.out.println("\n============== Task 3 =============\n");

        for (int i = 0; i < characters.length; i++) {
            System.out.println(characters[i]);
        }
        System.out.println("\n============== Task 4 =============\n");

        for (char character : characters) {
           System.out.println(character);
        }
        System.out.println("\n============== Task 5 =============\n");

        for (char character : characters) {
            if(Character.isLetter(character)) System.out.println(character);
        }
        System.out.println(" \n ");
        for (int i = 0; i < characters.length; i++) {
            if(Character.isLetter(characters[i])) System.out.println(characters[i]);
        }
        System.out.println("\n============== Task 6 =============\n");

        System.out.println(" \n For I \n");

        int counter = 0;

        for (int i = 0; i < characters.length; i++) {
            if(Character.isUpperCase(characters[i]))
                counter++;
        }
        System.out.println(counter);

        System.out.println(" \n For Each \n");

        int counter2 = 0;

        for (char element : characters) {
            if(Character.isUpperCase(element)) counter2++;
        }
        System.out.println(counter2);

    }
}
