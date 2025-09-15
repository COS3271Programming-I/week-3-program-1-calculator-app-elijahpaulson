package CalculatorAPP;
import java.util.Scanner;
public class CalculatorAPP {
	static Scanner userinput = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		// get user input as decimal
		System.out.print("Enter a decimal:");
		double x = userinput.nextDouble();
		System.out.print("Enter another decimal:");
		double y = userinput.nextDouble();
		
		// calculate and display results
		System.out.format("Sum: %.2f", x+y);
		System.out.format("\nProduct: %.2f", x*y);
		System.out.format("\nQuotient: %.2f", x/y);
		System.out.format("\nExponent: %.2f", Math.pow(x, y));
		System.out.format("\nLogarithm: %.2f", Math.log(x)/Math.log(y));
		
		
		
		
	}

}
