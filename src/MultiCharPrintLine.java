
public class MultiCharPrintLine {
	public static void main(String[] args) {
		printChars(5,3,"@");
		System.out.println();
		printChars(2,6,"#");
	}

	public static void printChars(int rows, int cols, String  letter ) {
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= cols; j++) {
				System.out.print(letter);
			}
			System.out.println();
		}
	}

}
