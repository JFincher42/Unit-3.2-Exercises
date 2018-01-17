
public class VariablePrintStars {


	public static void main(String[] args) {
		int size = 10;
		printStars(size);

		size = 5;
		printStars(size);

		size = 6;
		printStars(size);
		
		printStars(size*2-3);
	}

	public static void printStars(int rows) {
		for (int i=0; i<rows; i++) {
			System.out.println("*****");
		}
		System.out.println();
	}

}