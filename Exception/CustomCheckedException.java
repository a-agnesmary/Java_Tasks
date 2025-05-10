package Exception;

import java.util.Scanner;

class NegativeNumberException extends Exception{
	public NegativeNumberException(String message) {
		super(message);
	}
}
public class CustomCheckedException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the positive number : ");
		int number = sc.nextInt();
		try {
			if (number < 0) {
	            throw new NegativeNumberException("Negative numbers are not allowed,Please enter a positive number.");
	        }
		}
		catch(NegativeNumberException e) {
			System.out.println("NegativeNumber Exception: " + e.getMessage());
		}
		finally {
			sc.close();
		}
	}
}
