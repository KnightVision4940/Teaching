import java.util.Scanner;
import java.util.Random;
class Main {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
	int score = 100;       // <--
	int SCORE_MULTIPLIER = 10;  // <--- important things
	int SCORE_TO_WIN = 1000;    // <-- 
	while(0 < score && score < SCORE_TO_WIN) {
	System.out.println("guess 1-6: ");
			int guess = scan.nextInt();
			System.out.println("$ to bet?"); // literal skinner box
			int bet = scan.nextInt();
			int random = new Random().nextInt(6) + 1;
			if(score > 0) {
				System.out.println("wow. you went bankrupt. you absolute buffoon. one hundred dollars were given to you at the start of this game. and what did you do with them? lost every single money. how could you? what stroke of dog luck could have led you towards this incredible pitfall? i can imagine it now. bet 5. lose 5. bet 5. lose 5. that word. \"lose\". it must torment you. does it not? nobody is truly \"weak\", are they? obviously not. when did you think it was okay? why didn't you quit while you were ahead?if p your definition of \"ahead\" is away from crippling debt, inherited only to lose. i don't think i'll ever truly understand.");
			}
			if(bet < 0) {
				System.out.println("bet above zero you absolute luzr\nyou just lost $1 because fraud is bad and you should feel bad");
				score -= 1;
			}
			else if(random == guess) {
				System.out.println("correct!");
				score += SCORE_MULTIPLIER * bet;
			}
			else {
				System.out.println("you failed");
				score -= bet;
			}
		System.out.println("you have " + score + " monies");
		}
	}
}