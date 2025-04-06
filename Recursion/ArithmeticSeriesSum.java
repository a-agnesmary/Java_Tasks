package Recursion;

import java.util.Scanner;

public class ArithmeticSeriesSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		System.out.println("Sum of "+num+" : "+sumOfN(num));
		sc.close();
	}

	private static int sumOfN(int n) {
		// TODO Auto-generated method stub
		if(n<=0) {
			return 0;
		}
		return n+sumOfN(n-1);
	}

}
