package methods;

import jdk.internal.org.objectweb.asm.util.Printer;
import utilities.PrinterUtil;

public class PrintPractice {
    public static void main(String[] args) {
        PrinterUtil myPrinter = new PrinterUtil();

        myPrinter.printHello(); // Hello

        PrinterUtil.printName("Vlad");
        PrinterUtil.printName("Viktoria");
        PrinterUtil.printName("John");
    }
}
