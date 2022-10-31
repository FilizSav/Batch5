package arrays;

import java.util.Arrays;

public class _10_FindLongestShortest {
    public static void main(String[] args) {

        String[] colors = {"red", "blue", "yellow", "white"};

        LongestShortest(colors);

    }

    public static void LongestShortest(String[] s){

        String shortest = s[0], longest = s[0];

        for (int i = 1; i < s.length; i++) {
            if(longest.length() < s[i].length()){
                longest = s[i];
            }if(shortest.length() > s[i].length()){
                shortest = s[i];
            }
        }
        System.out.println("Longest = " + longest);
        System.out.println("Shortest = " + shortest);
    }

}
