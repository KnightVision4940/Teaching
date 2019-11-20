import java.util.Scanner;
import java.util.Random;
class Main {
	public static void main(String[] args) {
		static Scanner scan = new Scanner(System.in);
		int SCORE_TO_WIN = 1000; // <-- important thing
		System.out.println(makeBet());
	}
	public static String[] getPlayers() {
		int players = askInt("# of players?");
		for(int i = 0; i < players; i++) {
			System.out.println(i);
		}
	}
	public static int makeBet() {
		askInt("Guess 1-6: "); // literal skinner box
		int bet = askInt("$ to bet?");
		int random = new Random().nextInt(max) + 1;
		if(random == 1) {
			System.out.println("wow u did it");
			return 10 * bet;
		}
		System.out.println("you failed");
		return -bet;
	
	public static int askInt(String question) {
		System.out.println(question);
		int answer = scan.nextInt();
		return answer;
	}
	public static String ask(String question) {
		System.out.println(question);
		String answer = scan.nextLine();
		return answer;
	}
}