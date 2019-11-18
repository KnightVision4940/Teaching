import java.util.Scanner;

class BradTwo {
	public static void main(String[] args) {
		
	}
	public static String ask(String question) {
		Scanner scan = new Scanner(System.in);
		System.out.println(question);
		String answer = scan.nextLine();
		scan.close();
		return answer;
	}
}