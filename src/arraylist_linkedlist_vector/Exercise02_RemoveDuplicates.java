package arraylist_linkedlist_vector;


import java.util.*;

public class Exercise02_RemoveDuplicates {
    public static void main(String[] args) {

        ArrayList<String> lan = new ArrayList<>(Arrays.asList("Java","JavaScript", "Ruby", "Go", "Java", "Ruby", "Java"));
        ArrayList<String> uniques = new ArrayList<>();


        for (String s : lan) {
            if(!uniques.contains(s)) uniques.add(s);
        }
        System.out.println(uniques);

        System.out.println("===========");
        System.out.println(removeDup(lan));
        System.out.println(countO(lan));
    }

    public static ArrayList<String> removeDup(ArrayList<String> arr){
        LinkedHashSet<String> uniques = new LinkedHashSet<>(arr);
        return  new ArrayList<>(uniques);
    }

    public static int countO(ArrayList<String> arr){
        int count = 0;
        for (String s : arr) {
            if(s.contains("o")) count++;
        }return count;
    }

    public static LinkedHashMap<Character, Integer> countElements(String str){
        LinkedHashMap<Character, Integer> maps = new LinkedHashMap<>();

        for (Character c : str.toCharArray() ) {
            if(maps.containsKey(c)) maps.put(c,maps.get(c) + 1);
            else maps.put(c,1);
        }return maps;
    }
}
