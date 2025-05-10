package Exception;

import java.util.Scanner;

public class DivisionException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two integers: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		try {
			int division = num1 / num2;
			System.out.println(division);
		}
		catch (ArithmeticException e) {
		    System.out.println("Cannot divide by zero: " + e.getMessage());
		}	
		finally{
			sc.close();
		}
	}

}

// ArithmeticException - it is sub class of RuntimeException , it is in java.lang 