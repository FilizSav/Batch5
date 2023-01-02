package collections;

import java.util.Arrays;
import java.util.TreeSet;

public class Practice04_MInMax {
    public static void main(String[] args) {
        Integer[] arr = {10,100,123,507,25};
        Integer[] arr1 = {10};
        Integer[] arr2 = {};
        System.out.println(secondMax(arr));
        System.out.println(secondMax(arr1));
        System.out.println(secondMax(arr2));
        System.out.println(secondMin(arr));
        System.out.println(secondMin(arr1));
        System.out.println(secondMin(arr2));

        System.out.println("THis is one " + secondMaxNth(arr,3));

        System.out.println(min(arr));
        System.out.println(max(arr));
    }

    public static Integer secondMax(Integer[] arr){
        TreeSet<Integer> newList = new TreeSet<>(Arrays.asList(arr));
        newList.pollLast();
        try{return newList.last();}
        catch(Exception e) {return null;}
    }
    public static Integer secondMaxNth(Integer[] arr, int n){
        TreeSet<Integer> newList = new TreeSet<>(Arrays.asList(arr));
        if(newList.size() < n ) return null;// you can do this or try and catch- always testing edges what can possibly break my code
        for (int i = 0; i < n - 1; i++) {newList.pollLast();}
        return newList.last();
    }
    public static Integer min(Integer[] arr){
        return new TreeSet<>(Arrays.asList(arr)).pollFirst();
    }
    public static Integer max(Integer[] arr){
        return new TreeSet<>(Arrays.asList(arr)).pollLast();
    }
    public static Integer secondMin(Integer[] arr){
        TreeSet<Integer> newList = new TreeSet<>(Arrays.asList(arr));
        newList.pollFirst();
        try{return newList.first();}
        catch(Exception e) {return null;}
    }


}
