import Scanner;

class Brad {
	public static void main(String[] egg) {
		// nothing
	}

	// prompt() from better langs (ie python)
	public static string Prompt(String msg) {
		Scanner scan = new Scanner(System.in);
		System.out.println(msg);
		String reply = scan.nextLine();
		return reply;
	}
}