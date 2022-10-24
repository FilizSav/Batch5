package string_methods;

public class BooleanArray {
    public static void main(String[] args) {

        String[] cars = {"Tesla", "BMW", "Toyota"};

        boolean hasMercedes = false;

        for (String car : cars) {
            if (car.equals("Toyota")) {
                hasMercedes = true;
                break;
            }
        }
        System.out.println(hasMercedes);
    }
}
