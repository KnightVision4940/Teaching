public class Main {
	public static void main(String[] args) {
		int[] testTeam1 = {0, 2, 4, 6, 8};
		int[] testTeam2 = {1, 2, 3, 4, 5};
		System.out.println(shorterThan(4, testTeam1));
	}
	
	

	public static int shorterThan(int player, int otherTeam[]) {
		int total = 0;

		for(int i = 0; i < otherTeam.length; i++) {
			if(player < otherTeam[i]) {
				total++;
			}
		}

		return total;
	}
}