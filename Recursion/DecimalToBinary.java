package Recursion;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		System.out.println(getBinary(num));
		sc.close();
	}
	
	private static String getBinary(int n) {
		if(n==0)
			return "";
		return getBinary(n/2)+(n%2);
	}
}
