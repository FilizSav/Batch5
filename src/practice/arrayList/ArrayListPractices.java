package practice.arrayList;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListPractices {
    public static void main(String[] args) {


        AbstractList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == 2) numbers.set(i,7);
        }
        Iterator<Integer> numberIterator = numbers.iterator();
        while (numberIterator.hasNext()){
            Integer num = numberIterator.next();
            if (num % 2 == 0) numberIterator.remove();
        }System.out.println(numbers);
        for (int i = 0; i < 3; i++) {
            numbers.add(10);
        }
        System.out.println(numbers);
    }

}
