package homeworks;

import java.util.ArrayList;

public class Homework09 {
    public static void main(String[] args) {

        System.out.println("\n=============Task 1==============");

        int[] numbers = {-4, 1, -7, 0, 5, 10, 3, 45};
        ArrayList<Integer> duplicate = new ArrayList<>();

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++)
                if (numbers[i] == numbers[j]) duplicate.add(numbers[i]);
        }
        if (duplicate.isEmpty()) System.out.println("There is no duplicates");
        else System.out.println(duplicate.get(0));

        System.out.println("\n=============Task 2==============");

        String[] words = {"Z", "abc", "z", "123", "#" };
        ArrayList<String> stringDup = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length -1 ; j++) {
                if(words[i].toLowerCase().equals(words[j].toLowerCase())) stringDup.add(words[i]);
            }
        }if (stringDup.isEmpty()) System.out.println("There is no duplicates");
        else System.out.println(stringDup.get(0));

        System.out.println("\n=============Task 3==============");

        int[] num = {0, -4, -7, 0, 5, 10, 45, -7, 0};
        ArrayList<Integer> dupArr = new ArrayList<>();

        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length - 1; j++) {
                if (num[i] == num[j]) dupArr.add(num[i]);
            }
        } if (dupArr.isEmpty()) System.out.println("There is no duplicates");
        else for (Integer d : dupArr) { System.out.println(d);};

        System.out.println("\n=============Task 4==============");

        String[] word = {"A", "foo", "12" , "Foo", "bar", "a", "a", "java"};
        ArrayList<String> wordDup = new ArrayList<>();

        for (int i = 0; i < word.length - 1; i++) {
            for (int j = i + 1; j < word.length; j++)
                if (word[i].equalsIgnoreCase(word[j]) && !wordDup.contains(word[i].toUpperCase()))
                    wordDup.add(word[i]);
        }
        if (wordDup.isEmpty()) System.out.println("There is no duplicates");
        else for (String s : wordDup) System.out.println(s);

        System.out.println("\n=============Task 5==============");
        String[] wordR = {"abc", "foo", "bar"};
        ArrayList<Object> rWord = new ArrayList<>();

        for (int i = wordR.length-1; i >=0 ; i--) {
            rWord.add(wordR[i]);
        }
        System.out.println(rWord.toString());


        System.out.println("\n=============Task 6==============");

        String str = "Java is fun";
        String[] word6 =str.split(" ");
        String reverseWord="";
        for(String w:word6){
            StringBuilder sb = new StringBuilder(w);
            sb.reverse();
            reverseWord+=sb.toString() + " " ;
        }
        System.out.println(reverseWord);
    }
}
