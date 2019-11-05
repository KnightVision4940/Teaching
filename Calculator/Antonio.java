import java.util.Scanner;
public class Antonio {
    static int number1;
    static int number2;
    static String operator;
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("What is your first number?");
        int number1 = in.nextInt();

        System.out.println("What is your second number?");
        int number2 = in.nextInt();

        System.out.println("What is your operation?");
        String operator = in.nextLine();

    //static void Calculation() {
        
        if (operator.equals ("addition")) {
            System.out.println(number1 + number2);
        }
        else if (operator.equals ("subtraction")) {
            System.out.println(number1 - number2);
        }
        else if (operator.equals ("multiplication")) {
            System.out.println(number1 * number2);
        }
        else if (operator.equals ("division")) {
            System.out.println(number1 / number2);
        }
        else {
            System.out.println("Invalid operation!");
        }
   // }
    }
}