package casting;

public class CastingChar {
    public static void main(String[] args) {
        int i1 = 65; char c1 = (char)i1;

        System.out.println((char)289);

        char char1= 'A';
        char char2= 97;

        System.out.println(char1+char2);
        System.out.println("" +char1+char2);
        System.out.println("" +(char1+char2));
        System.out.println(1+1+1+"S"+(1+1+1));

        System.out.println('A' + 'b' + 20 + " Hello " + 2 +1);
        System.out.println('A' + 'b' + 20 + " Hello " + (2 +1));

    }
}
