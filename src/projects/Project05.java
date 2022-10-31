package projects;

import java.util.Arrays;
import java.util.Collections;

public class Project05 {
    public static void main(String[] args) {

        System.out.println("\n=============Task 1 =============\n");

        int[] withSort = {10, 7, 7, 10, -3, 10, -3};

       Arrays.sort(withSort);

        System.out.println("Smallest = " + withSort[0]);
        System.out.println("Greatest = " + withSort[withSort.length - 1]);

        System.out.println("\n=============Task 2 =============\n");

        System.out.println("Smallest = " + findSmallest(withSort));
        System.out.println("Greatest = " + findGreatest(withSort));

        System.out.println("\n=============Task 3 =============\n");

        int[] withSorts = {10, 5, 6, 7, 8, 5, 15, 15};

        Arrays.sort(withSorts);

        System.out.println("Second Smallest = " + withSorts[2]);
        System.out.println("Second Greatest = " + withSorts[withSorts.length - 3]);

        System.out.println("\n=============Task 4 =============\n");
        int secondGreatest = Integer.MIN_VALUE, secondSmallest = Integer.MAX_VALUE;

        for (int s : withSorts) {
            if (s > secondGreatest && s < findGreatest(withSorts)) secondGreatest = s;
            if (s < secondSmallest && s > findSmallest(withSorts)) secondSmallest = s;
        }
        System.out.println("Second smallest = " + secondSmallest);
        System.out.println("Second greatest = " + secondGreatest);

        System.out.println("\n=============Task 5 =============\n");

        String[] duplicate = {"foo", "bar", "Foo", "bar", "6", "abc", "6", "xyz"};

        String duplicates = " ";

        for (int i = 0; i < duplicate.length - 1; i++) {
            for (int j = i + 1; j < duplicate.length; j++) {
                if (duplicate[i].equals(duplicate[j])) duplicates += duplicate[i] + " ";
            }
        }
        String[] word = duplicates.split(" ");
        Arrays.toString(word);
        for (String s : word) {System.out.println(s);}

            System.out.println("\n=============Task 6 =============\n");

            String[] repeatElem = {"pen", "eraser", "pencil", "pen", "123", "abc", "pen", "eraser"};

        System.out.println("The most repeated word = " + mostRepeatedElementInAnArray(repeatElem));


    }
    public static int findGreatest(int[] nums) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        for (int i : nums) {
            if(i > max) max = i;

        }return max;
    }
    public static int findSmallest(int[] nums) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        for (int i : nums) {
            if(i < min) min = i;

        }return min;
    }
    public static int removeDuplicates(int a[], int n) {
        if (n == 0 || n == 1) {

        }return n;
    }
    public static String findDuplicates(String[] s) {
        String duplicates = "";

        for (int i = 0; i < s.length -1; i++) {
            for (int j = i + 1; j < s.length; j++) {
                if(s[i].equals(s[j])) duplicates+= " " + s[i];
            }
        }
    return duplicates;
    }

    public static String mostRepeatedElementInAnArray(String[] s) {
        String mostRepeat = "";
        int count = 0;
        int mostCount = 0;

        for (int i = 0; i < s.length-1; i++) {
            for (int j = i + 1; j < s.length ; j++) {
                if(s[i].equals(s[j])) count++;
            }
            if(mostCount > count) mostRepeat+= mostRepeat + " ";
        }return mostRepeat;
    }
}