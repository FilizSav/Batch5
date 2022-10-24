package loops.fori_loops;

import utilities.ScannerHelper;

public class Exercise06_PrintNumbersScanner {
    public static void main(String[] args) {

        int num = ScannerHelper.getANumber();
        for (int i = 0; i <= num; i++) {
            if (i % 2 ==1)
                System.out.println(i);
        }
        int numb = ScannerHelper.getANumber();
        int numb2 = ScannerHelper.getANumber();

        for (int i = Math.min(numb,numb2); i <= Math.max(numb,numb2); i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }

    }
}
