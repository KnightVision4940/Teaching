import java.util.Scanner;
public class Antonio {
    static int number1;
    static int number2;
    static String operator;
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("What is your first number?");
        number1 = in.nextInt();

        System.out.println("What is your second number?");
        number2 = in.nextInt();

        System.out.println("What is your operation?");
        operator = in.next();

        Calculation();

    }
    public static void Calculation() {
        
        if(operator.equals("+")) {
            System.out.println(number1 + number2);
        }
        else if(operator.equals("-")) {
            System.out.println(number1 - number2);
        }
        else if(operator.equals("*")) {
            System.out.println(number1 * number2);
        }
        else if(operator.equals("/")) {
            System.out.println(number1 / number2);
        }
        else {
            System.out.println("Invalid operation!");
        }
    }
    
}