package Exception;

import java.util.Scanner;

public class ArrayIndexException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {1,2,3,4,5};
		System.out.print("Enter an index to access the array: ");
		try {
			int index = sc.nextInt();
			System.out.println("Element at index " + index + " is: " + arr[index]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception : " + e.getMessage());
		}
		finally {
			sc.close();
		}
	}
}
