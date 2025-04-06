package Recursion;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		System.out.print("Enter the power : ");
		int power = sc.nextInt();
		System.out.println(power(num,power));
		sc.close();
	}
	
	private static int power(int base, int exp) {
		if(exp==0) {
			return 1;
		}
		return base*power(base,exp-1);
	}

}
