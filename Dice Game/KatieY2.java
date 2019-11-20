/* How to add generate a random number:
int min = 1
int max = 30
int random = (int)(Math.random() * max + min);

This will generate a random number from 1 to 30
*/
import java.util.Random;
import java.util.Scanner;

public class KatieY2{
  static  Scanner in=new Scanner(System.in);
   static Random rand = new Random();
    public static void main(String[] args) {
   
        System.out.println("Give a number between 1-6");
        int first = in.nextInt();
    if(first > 6){
        System.out.println("A number less than 6 or 6");
        first  = in.nextInt();
        }
    int dice= rand.nextInt(6) +1;
    // System.out.println(dice);

    if(dice == first){
        System.out.println("Congradulations, you win!");
        }
    else{
        System.out.println("You lose."); 
        }
    
    }

}