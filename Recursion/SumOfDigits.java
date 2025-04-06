package Recursion;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		System.out.println(sum(num));
		sc.close();
	}

	private static int sum(int n) {
		// TODO Auto-generated method stub
		if(n==0) {
			return 0;
		}
		return (n%10)+sum(n/10);
	}
}
