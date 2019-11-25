/* How to add generate a random number:
int min = 1
int max = 30
int random = (int)(Math.random() * max + min);

This will generate a random number from 1 to 30
*/
import java.util.Random;
import java.util.Scanner;
import java.util.scanner;
public class Rocco{
  static int Money;
  static String name;
  static Scanner in = new Scanner(System.in);
  static Random rand = new Random();
  public static void main (String[] args) {
    System.out.println("What is your guessed number?");
    int Guessednumber = in.nextInt();
    System.out.println(Guessednumber);
    int dice = rand.nextInt(6) +1;    
    }
}
