package collections;


import java.util.Arrays;
import java.util.LinkedHashSet;


public class Practice01_RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(removeDuplicates(new Integer[]{-5, 10, -5, 10, 1, 2, 5})));
    }
    public static Integer[] removeDuplicates(Integer[] r){
        return new LinkedHashSet<>(Arrays.asList(r)).toArray(new Integer[0]);
    }

}
