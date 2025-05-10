package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PhoneNumberException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the phone number : ");
		try {
			Long phoneNo = sc.nextLong();
			System.out.println("Phone Number is : "+phoneNo);
		}
		catch(InputMismatchException e) {
			System.out.println("InputMismatchException: Please enter numeric digits only ."+e.getMessage());
		}
		finally {
			sc.close();
		}
	}
}


//InputMismatchException - it is sub class of java.util.NoSuchElementException , it is in java.lang.RuntimeException