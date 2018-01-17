
public class Caution2 {
	public static void printDoubleX(int x) {
		System.out.println("  printDouble(): parameter x is: " + x);
		x = 2 * x;	// Changes parameter value
		System.out.println("  printDouble(): parameter x is now: " + x);
	}
	public static void main(String[] args) {
		int y = 1;
		System.out.println("main(): y is: " + y);
		printDoubleX(y);  
		System.out.println("main(): y is now: " + y);
	}

}
