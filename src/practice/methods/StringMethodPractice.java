package practice.methods;

public class StringMethodPractice {
    public static void main(String[] args) {

        System.out.println(StringMethodPractice.isCharExisting("Filiz", 'i',1));
        System.out.println(StringMethodPractice.isCharContained("peter", 'o'));

        lengthOfString("John");
        lengthOfString("");
        lengthOfString("JavaScript");
        lengthOfString("Scrpt");

        findMidLength("filiz");
        divideString("fillliz");

    }
   public static boolean isCharExisting(String str, char c, int index){
      return  str.charAt(index) == c;
   }
   public static boolean isCharContained(String str, char c){
      //  return str.contains(String.valueOf(c));
        return str.contains(c + "");
   }
    public static void lengthOfString(String str) {
        if (str.isEmpty()) {
            System.out.println("Length is zero");
        } else {
            System.out.println("Length is = " + str.length());
            System.out.println("First char is = " + str.charAt(0));
            System.out.println("The last char is = " + str.charAt(str.length() - 1));
        }
        if (str.toLowerCase().contains("a") || str.toLowerCase().contains("e") || str.toLowerCase().contains("i") ||
                str.toLowerCase().contains("o") || str.toLowerCase().contains("u")) {
            System.out.println("This String has vowel");
        } else {
            System.out.println("This String doesn't have vowel");
        }

    }

    public static void findMidLength(String str){
        if (str.length() < 3) {
                System.out.println("Length is less than 3");
        } else {

            if (str.length() % 2 == 0) {
                System.out.println(str.substring(str.length() / 2 - 1, str.length() / 2 + 1));
            } else {
                System.out.println(str.charAt(str.length() / 2));
            }
        }
    }
    public static void divideString(String str) {
        if (str.length() < 4) {
            System.out.println("INVALID INPUT");
        } else {
            System.out.println("First two characters are " + str.substring(0,2));
            System.out.println("Last two characters are " + str.substring(str.length() - 2));
            System.out.println("The other characters are " + str.substring(2,str.length() -2));
        }
    }
    public static void printFirstLastSame(String str){
        if(str.length()<2){
            System.out.println("Length is less than 2");
        }else System.out.println(str.substring(0,2).equals(str.substring(str.length()-2)));
//str.length() < 2 ? "Length is less than 2" : (str.substring(0,2).equals(str.substring(str.length()-2))
    }
}
