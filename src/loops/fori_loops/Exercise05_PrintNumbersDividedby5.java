package loops.fori_loops;

import utilities.MathHelper;
import utilities.ScannerHelper;

public class Exercise05_PrintNumbersDividedby5 {
    public static void main(String[] args) {


        for (int i = 0; i<= 50; i++){
            if (i % 5 ==0) System.out.println(i);
        }

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
