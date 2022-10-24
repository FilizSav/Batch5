package arrays;

import java.util.Arrays;

public class SearchingInAStringArray {
    public static void main(String[] args) {

        /*                  STEPS TO SORT AN ELEMENT
        1- sort the array
        2- then, use Arrays.binarySearch(collection, element) method
             -if this returns zero or positive index, then it means the element you search for exits
             in the array
             - if this returns negative index, then it means the element you search for does not exist
         */


        String[] objects = {"Remote", "Mouse", "Mouse", "Keyboard", "iPad"};

        boolean mouse = false;

        for (String object : objects) {
            if (object.equals("Mouse")){ mouse = true;
            break;}
        }
        System.out.println(mouse);

        Arrays.sort(objects);

        System.out.println(Arrays.binarySearch(objects, "Mouse")>=0);  // in array
        System.out.println(Arrays.binarySearch(objects, "Computer")>=0); // not in array

    }
}
