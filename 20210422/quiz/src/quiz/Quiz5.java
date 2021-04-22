package quiz;

public class Quiz5 {
	public static void main(String[] args) throws Exception {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; i >= j; j++) {
				System.out.print("■");
			}
			System.out.print("\n");
		}
	}
}