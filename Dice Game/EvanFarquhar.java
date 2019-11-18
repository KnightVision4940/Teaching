/* How to add generate a random number:
int min = 1
int max = 30
int random = (int)(Math.random() * max + min);

This will generate a random number from 1 to 30
*/

import java.util.Random;
import java.util.Scanner;
 
public class EvanFarquhar{
 static Scanner in = new Scanner(System.in);
 static Random randnum = new Random();
 public static void main(String[] args) {
     System.out.println("guess your number (1-6)");
    int wrong = in.nextInt();
 if (wrong > 6) {
    System.out.println("it has to be less than 6");
   wrong = in.nextInt();
 }
   int  dice = randnum.nextInt(6) +1;  
System.out.println(dice);

 }
 }