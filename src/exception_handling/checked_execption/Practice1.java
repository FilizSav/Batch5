package exception_handling.checked_execption;

import java.io.File;
import java.io.IOException;

public class Practice1 {
    public static void main(String[] args) throws InterruptedException, IOException {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            Thread.sleep(250);
        }

        File file = new File("Hello.xls");
        file.createNewFile();
        Thread.sleep(5000);
        file.delete();
    }
}
