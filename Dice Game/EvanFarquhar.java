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
 static int money = 100;
 public static void main(String[] args) {

   System.out.println("this is how this game works, so you start with $100 and the goal is to get more money!");
   play();
 }

 public static void play() {

     System.out.println("guess your number (1-6)");
     int wrong = in.nextInt();
    
 if (wrong > 6) {
    System.out.println("it has to be less than 6");
   wrong = in.nextInt();
 }
if (wrong < 1){
   System.out.println("it has to be more than 0 and not 0 and up to 6!");
   wrong = in.nextInt();
}
System.out.println("how much do you want to bet on your number?");
int bet = in.nextInt();
 
if (bet > money){
   System.out.println("sorry you don't have enough money, bet something under $" + money);
   bet = in.nextInt();
}

   int  dice = randnum.nextInt(6) +1;  
System.out.println("random number is: " + dice);

if (dice == wrong){
  int win = bet * 2;
  System.out.println("You win: " + win);
   int winner = money + win;
  System.out.println("Now you have$" + winner);
}

else {
   int win = bet * 2;
   System.out.println("You lose, but you could have won: " + win);
   int lose = money - bet;
    System.out.println("Now you only have$" + lose);
}

if (money > 0){
   play();
}

else{
   System.out.print("game over!!!");
}
 }
 }