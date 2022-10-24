package utilities;

public class CharMethods {

    public static int countLetters(String s) {
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                counter++;
            }
        }
        return counter;
    }
    public static int findFirstIndex(String s, char c) {

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                return i;
            }
        }
       return -1;
    }
    public static int findLastIndex(String s, char c) {

        for (int i = s.length()-1; i >=0; i--) {
            if (s.charAt(i) == c) {
                return i;
            }
        }
        return -1;
    }
    public static String clearChar(String s, char c) {

        String newS = "";
        for (int i = 0; i <= s.length()-1; i++) {
            if (s.charAt(i) != c) {
                newS += s.charAt(i);
            }
        }
        return newS;

    }
    public static String clearWord(String s, String word) {
         if (s.length() < word.length()){return "";}
        String newS = "";
        for (int i = 0; i < s.length(); i++) {
            if (!s.substring(i).startsWith(word)){
                continue;
        }else{
               i =+ word.length() -1;}
        }return newS;
    }

    public static String frontAndBack(String s) {
        String str = "";
        for (int i = 0; i < s.length()/2; i++) {
            if (s.endsWith(s.substring(0, i + 1))){
               str = s.substring(0, i + 1);
            }
        }
       return str;
    }

    public static int countChar(String s, char c){
        int counter = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) counter++;
        }

        return counter;
    }
    public static char mostRepeatedChar(String s){
        char mostRepeated = ' ';
        int mostAmountOfRepetition = 0;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isWhitespace(s.charAt(i))) continue;

            if (countChar(s, s.charAt(i)) > mostAmountOfRepetition){
//               mostRepeated = 'B';
//                mostAmountOfRepetition = 1;
//                mostRepeated = 'a';
//                mostAmountOfRepetition = 3;
                mostRepeated = s.charAt(i);
                mostAmountOfRepetition = countChar(s, s.charAt(i));
            }
        }

        return mostRepeated;
    }
}