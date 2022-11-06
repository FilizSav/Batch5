package practice.arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class FindCommonElements {
    public static void main(String[] args) {
        ArrayList<Integer> numbers1 = new ArrayList<>(Arrays.asList(10,20,20,30,50,70));
        ArrayList<Integer> numbers2 = new ArrayList<>(Arrays.asList(20,50,70,100,300));


     commonElements(numbers1,numbers2);
    }

    public static void commonElements(ArrayList<Integer> num1,ArrayList<Integer> num2 ){

        ArrayList<Integer> commonS = new ArrayList<>();

        for (int i = 0; i < num1.size(); i++) {
            for (int j = 0; j < num2.size(); j++) {
              if (num1.get(i).equals(num2.get(j)) && !commonS.contains(num1.get(i)))
            commonS.add(num1.get(i));
            }
        }
        if (commonS.isEmpty()) System.out.println("There are no matching elements");
        else commonS.forEach(System.out :: println);
    }
}
