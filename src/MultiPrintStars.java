
public class MultiPrintStars {
	public static void main(String[] args) {
		printStars(5,3);
		System.out.println();
		printStars(2,6);
	}

	public static void printStars(int rows, int cols ) {
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= cols; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
