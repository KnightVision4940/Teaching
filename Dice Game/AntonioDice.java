/* How to add generate a random number:
int min = 1
int max = 30
int random = (int)(Math.random() * max + min);

This will generate a random number from 1 to 30
*/
import java.util.*;
public class Antonio {
	static int money;
	static String name;
	static Scanner in = new Scanner(System.in);
	static Random rand = new Random();
	static int dice;
    
	public static void main(String[] args) {
		
		System.out.println("Please enter your name");
        name = in.nextLine();
        
		System.out.println("Welcome " + name);
		
		money = 1000;
		
		rollDice();

	}
	public static void rollDice() {

        System.out.println("You have: $ " + money);
        
		System.out.println("What number would you like to bet on? (1-6)");
		
        int betRoll = in.nextInt();
        
		System.out.println("How much would you like to bet?");
		int betMoney = in.nextInt();
		
		while (betMoney > money) {
			System.out.println("You don't have enough money for that! You have: $" + money +
					           "Please place another bet");
			betMoney = in.nextInt();
		}
		dice = rand.nextInt(6) + 1;
		
		if(betRoll == dice) {
			System.out.println("You win! You have won: $" + betMoney*2);
			money = money + betMoney*2;
		}
		else{
			System.out.println("You lost!");
			money = money - betMoney;
		}
		
		if (money <= 0){
			System.out.println("You are broke!");
		}
		else{
			rollDice();
		}
	}
}