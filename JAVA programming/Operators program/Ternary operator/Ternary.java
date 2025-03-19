public class Ternary {
	public static void main(String[] args) {
		int a = 10, b = 5, c = 8;
		System.out.println("The three numbers is 10, 5, 8.");
		System.out.println("Largest : " + ((a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c)));

	}
}