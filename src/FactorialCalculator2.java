import java.util.Scanner;

/**
 * Prompt the user for an integer from 1 to 10. Display the factorial of the
 * number entered by the user.
 * 
 * Constraint: Use recursion
 * 
 * @author Yasmin
 * @version 2.0
 *
 */
public class FactorialCalculator2 {

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
		if (number == 1) {
			return 1;
		}
		return number * calculateFactorial(--number);
	}
}
