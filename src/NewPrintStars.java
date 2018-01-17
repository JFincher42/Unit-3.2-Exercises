
public class NewPrintStars {

	public static void main(String[] args) {
		printStars(5);
		System.out.println();
		printStars(6);
	}
	
	public static void printStars(int rows) {
		for (int i=0; i<rows; i++) {
			System.out.println("*****");
		}
	}

}
