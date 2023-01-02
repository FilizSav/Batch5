package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class _01_Lists {
    public static void main(String[] args) {

        /*
        -They preserve insertion order
        -They allow duplicates
        _They allow null elements
        //Linked list has more functionality
        -Performance
        -Memory
        -Initial capacity
        -Load
        -They way they store data
         */
        LinkedList<String> fruits = new LinkedList<>();

        fruits.add("Apple");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("");
        fruits.add("");
        fruits.add(null);
        fruits.add(null);

        System.out.println(fruits);
    }
}
