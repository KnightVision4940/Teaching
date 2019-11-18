/* How to add generate a random number:
int min = 1
int max = 30
int random = (int)(Math.random() * max + min);

This will generate a random number from 1 to 30
*/
import java.util.Random;
import java.util.Scanner;

public class KatieY2{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Random rand = new Random();
       
        System.out.println("Give a number between 1-6");
        int big = in.nextint();
    if(big > 6){
        System.out.println("A number less than 6 or 6");
    }
    int dice= rand.nextInt(6) +1;
    System.out.println(dice);

    
    }

}