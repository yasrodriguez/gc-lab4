import java.util.Scanner;

/**
 * Prompt the user for an integer from 1 to 10. Display the factorial of the
 * number entered by the user.
 * 
 * @author Yasmin
 * @version 1.0
 *
 */
public class FactorialCalculator {

	/**
	 * Gets a number from the user and calls the method to calculate the factorial.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome to the Factorial Calculator!");

		String prompt = "Enter an integer that's greater than 0, but less than 10: ";
		int userInput = Validator.getInt(scan, prompt, 1, 9);

		System.out.println(calculateFactorial(userInput));
	}

	/**
	 * Calculates the factorial of the number.
	 * 
	 * @param number
	 *            a number from 1 to 9.
	 * @return factorial
	 */
	public static int calculateFactorial(int number) {
		int total = 1;

		for (int i = number; i > 1; i--) {
			total *= i;
		}
		return total;
	}
}
