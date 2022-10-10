package conditional_statements.if_else_statements;

public class IfElseSyntax {
    public static void main(String[] args) {
        /*
        -if or else statements are used to control the flow of the program based on conditions
        -conditions are always boolean statements (true or false)
        - else can never be used without it
        - if block can be used alone
        */

        boolean condition = false;
        // if block it executes if the condition is true
        // if else block executes if the condition is false
        if (condition) {
            System.out.println("GOOD");
        }
        else {
            System.out.println("BAD");
            System.out.println("End of program!");

            boolean day = true;
            if (day){
                System.out.println("Today is Sunday");
            }
            else {
                System.out.println("Today is Weekday");}
        }
    }
}