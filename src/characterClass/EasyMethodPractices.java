package characterClass;

public class EasyMethodPractices {
    public static void main(String[] args) {
        String s1 = "2860 south river road des plaines il";
        String s2 = "12334 @!#$!@ TechGlobal";
        System.out.println("String: \"" + s1 + "\" has: \n" + countLetters(s1) + " letters");
        System.out.println("String: \"" + s2 + "\" has: \n" + countLetters(s2) + " letters");



        String s3 = "12334 @!#$!@ TechGlobal"; //-> 2
        String s4 = "TeChGloBal"; //-> 4
        String s5 = "123123 TeChGloBal #$%#$%"; //-> 4
        System.out.println("String: \"" + s3 + "\" has: \n" + countUpperCase(s3) + " Upper Case letters");
        System.out.println("String: \"" + s4 + "\" has: \n" + countUpperCase(s4) + " Upper Case letters");
        System.out.println("String: \"" + s5 + "\" has: \n" + countUpperCase(s5) + " Upper Case letters");
//
//        Print output -> "Given "(string)" has:
//        x amount of upper cases
//        x amount of lower cases
//        x amount of letters
//        x amount of digits
//        x amount of spaces
//        x amount of specials"

        System.out.println("Given " + s3 + " has: \n" + countUpperCase(s3) + " amount of upper cases\n" +
                countLowerCase(s3)+ " amount of lower cases\n" +
                countLetters(s3)+ " amount of letters\n" +
                countDigits(s3) + " amount of digits\n" +
                countSpaces(s3) + " amount of spaces\n" +
                "//        x amount of specials");




    }


    public static int countLetters(String s){
        int counter = 0;
        for (int i = 0; i < s.length(); i++){ // i = 0, 1, 2, 3,...L - 1
            if (Character.isLetter(s.charAt(i))){
                counter++;
            }
        }
        return counter;
    }

    public static int countUpperCase(String s){
        int counter = 0;
        for (int i = 0; i < s.length(); i++){ // i = 0, 1, 2, 3,...L - 1
            if (Character.isUpperCase(s.charAt(i))){
                counter++;
            }
        }
        return counter;
    }
    public static int countLowerCase(String s){
        int counter = 0;
        for (int i = 0; i < s.length(); i++){ // i = 0, 1, 2, 3,...L - 1
            if (Character.isLowerCase(s.charAt(i))){
                counter++;
            }
        }
        return counter;
    }
    public static int countDigits(String s) {
        int counter = 0;
        for (int i = 0; i < s.length(); i++) { // i = 0, 1, 2, 3,...L - 1
            if (Character.isDigit(s.charAt(i))) {
                counter++;
            }
        }
        return counter;
    }
    public static int countSpaces(String s){
        int counter = 0;
        for (int i = 0; i < s.length(); i++){ // i = 0, 1, 2, 3,...L - 1
            if (Character.isWhitespace(s.charAt(i))){
                counter++;
            }
        }
        return counter;
    }

}