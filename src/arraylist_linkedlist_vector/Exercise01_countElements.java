package arraylist_linkedlist_vector;

import java.util.ArrayList;

public class Exercise01_countElements {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();

        colors.add("Blue");
        colors.add("Brown");
        colors.add("Pink");
        colors.add("Yellow");
        colors.add("Red");
        colors.add("Purple");
        System.out.println(colors);
        System.out.println(colors.size());

        System.out.println("\n -------------For Each -------------\n");

        int count = 0;
        for (String color : colors) {
            System.out.println(color);

            if (color.length() == 6) count++;
        }
        System.out.println(count);

        System.out.println("\n -------------For I  -------------\n");
        int count6 = 0;
        for (int i = 0; i < colors.size(); i++) {
            if (colors.get(i).length() == 6) count6++;
        }
        System.out.println(count6);

        System.out.println("\n ------------Count elements 'o' -------------\n");
        int countO= 0;

        for (String color : colors) {
            if(color.contains("o"))countO++;

        }
        System.out.println(countO);

        countO= 0;
        for (int i = 0; i < colors.size(); i++) {
            if(colors.get(i).contains("o")) countO++;
        }
        System.out.println(countO);
    }
}
