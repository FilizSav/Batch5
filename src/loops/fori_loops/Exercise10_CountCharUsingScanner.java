package loops.fori_loops;

import utilities.ScannerHelper;

public class Exercise10_CountCharUsingScanner {
    public static void main(String[] args) {

        String name = ScannerHelper.getAName();

        int count = 0;

        for (int i = 0; i <=name.length()-1 ; i++) {
            if(name.toLowerCase().charAt(i) == 'l') count++; // name.substring(i,i+1).equalsIgnoresCase
        }
        System.out.println(count);
    }
}
