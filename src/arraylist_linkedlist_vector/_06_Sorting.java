package arraylist_linkedlist_vector;

import java.util.*;

public class _06_Sorting {
    public static void main(String[] args) {


        LinkedList<Integer> numbers = new LinkedList<>(Arrays.asList(10, -3, 5, 15));
        List<String> electronics = new LinkedList<>(Arrays.asList("Remote", "Phone", "Laptop"));

        System.out.println(numbers);
        System.out.println(electronics);

        Collections.sort(numbers);
        Collections.sort(electronics);

    }
}
