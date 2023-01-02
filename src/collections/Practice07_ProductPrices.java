package collections;

import java.util.*;

public class Practice07_ProductPrices {
    public static void main(String[] args) {

        HashMap<String, Integer> apple = new HashMap<>();
        apple.put("iPhone", 1000);
        apple.put("MacPro", 1300);
        apple.put("iMac", 1500);
        apple.put("AirPods", 200);
        apple.put("iPad", 700);



        Set<Integer> result = new LinkedHashSet<>();
        int max = new TreeSet<>(apple.values()).last();
        for(Map.Entry<String, Integer> entry : apple.entrySet()){
           if(entry.getValue() == max) System.out.println(max);
        }
    }
}
