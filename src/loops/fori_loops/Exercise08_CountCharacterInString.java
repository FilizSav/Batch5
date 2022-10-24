package loops.fori_loops;

public class Exercise08_CountCharacterInString {
    public static void main(String[] args) {

        String str = "TechGlobal School";
        int count = 0;
        for (int i = 0; i<= str.length()-1 ; i++) {
            if (str.charAt(i) == 'o') count++;
        }
        System.out.println(count);
    }
}
