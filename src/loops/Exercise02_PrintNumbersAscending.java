package loops;

public class Exercise02_PrintNumbersAscending {
    public static void main(String[] args) {

        String str = "";
        for (int i = 1; i <=10 ; i++) {
        if(i != 10) System.out.print(i + " - ");
        else System.out.println(i);
        }

        String result = "";
        for (int i = 1; i <=10 ; i++){
            result += i + " - ";
        }
        System.out.println(result.substring(0,result.length()-3));
    }
}
