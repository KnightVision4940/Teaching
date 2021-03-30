import java.util.Scanner;
import java.util.Random;

public class Dice{
    static Scanner in = new Scanner(System.in);
    static Random rand = new Random();
    public static void main(String[] args) {
        int dice = rand.nextInt(6)+1;
        int guess = in.nextInt();
        System.out.println("the Number was: "+dice);

        if(guess==dice){
            System.out.println("You Guessed Correctly");
        }else{
            System.out.println("Your Wrong");
        }


    }

}