package arrays;

public class _16_split {
    public static void main(String[] args) {

        String s1 = "I love Java";

        int counter = 0;
        for (char s : s1.toLowerCase().toCharArray()) {
            if (s == 'a')counter++;
        }
        System.out.println(counter+1);


    }
}
