package arraylist_linkedlist_vector;

import java.util.ArrayList;
import java.util.Arrays;

public class _01_UnderstandingArrayList {
    public static void main(String[] args) {
        // 1. Declaring an array vs an ArrayList

        String[] names1 = new String[3];

        ArrayList<String> names2 = new ArrayList<>(); // capacity is = 10 by default

        // 2. Getting the size of the array vs ArrayList
        System.out.println("\n ---------Size of array vs ArrayList -----------\n");
        System.out.println("The size of the array is = " + names1.length);
        System.out.println("The size of the ArrayList is = " + names2.size());

        // 3. Printing an array vs ArrayList
        System.out.println("\n ---------Printing Size array vs ArrayList -----------\n");
        System.out.println("The array list = " + Arrays.toString(names1));
        System.out.println("The aArrayList = " + names2);

        // 4. Adding elements to specific indexes
        System.out.println("\n ---------Printing elements array vs ArrayList -----------\n");
        names1[0] = "Alex";
        names2.add(0, "John");
        System.out.println("The array list = " + Arrays.toString(names1));
        System.out.println("The aArrayList = " + names2);


        names1[1] = "Ali";
        names1[2] = "Andrii";

        names2.add("Joe");
        names2.add("Jane");
        names2.add("Abdallah");
        names2.add(" Vlad" );
        names2.add("Saeed" );
        names2.add("Suzanne" );
        names2.add("Hazal");
        names2.add("Yildiz" );
        names2.add("Samir");

        System.out.println("The aArrayList = " + names2);

        names2.set(1, "Olena");
        System.out.println("The aArrayList = " + names2);

    }
}
