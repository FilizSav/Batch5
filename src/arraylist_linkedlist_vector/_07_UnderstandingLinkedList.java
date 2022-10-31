package arraylist_linkedlist_vector;

import java.util.Arrays;
import java.util.LinkedList;

public class _07_UnderstandingLinkedList {
    public static void main(String[] args) {

        LinkedList<Double> numbers = new LinkedList<>(Arrays.asList(10.5, 5.5, 20.0));

        System.out.println(numbers); // 10.5, 5.5, 20.0
        System.out.println(numbers.size()); //3
        System.out.println(numbers.contains(10.5)); // true
        System.out.println(numbers.indexOf(4)); // -1
        System.out.println(numbers.get(1)); // 5.5
        System.out.println(numbers.getFirst()); // 10.5
        System.out.println(numbers.getLast()); //20.0
        System.out.println(numbers.offer(4.5)); // true
        System.out.println(numbers.offerFirst(4.5)); // true
        System.out.println(numbers);

        System.out.println(numbers.pollLast());
        System.out.println(numbers);
        //System.out.println(numbers.addFirst(4.5)); doesn't work because it is void it changes but doesn't return anything

        System.out.println(numbers.pop()); //returns and removes first element
        System.out.println(numbers);

        System.out.println(numbers.pollFirst());
        System.out.println(numbers);

       numbers.push(2.0); // void adds an element to the 0 index
        System.out.println(numbers);


    }
}
