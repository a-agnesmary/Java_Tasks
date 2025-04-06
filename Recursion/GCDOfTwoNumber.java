package Recursion;

import java.util.Scanner;

public class GCDOfTwoNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number -1 : ");
		int num1 = sc.nextInt();
		System.out.print("Enter the number -2 : ");
		int num2 = sc.nextInt();
		System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd(num1,num2));
		sc.close();
	}
	private static int gcd(int n1, int n2) {
		if(n2==0) {
			return n1;
		}
		return gcd(n2,n1%n2);
	}
	
}
