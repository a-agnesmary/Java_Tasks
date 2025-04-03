package Loops;

import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number 1 :");
		int num1 = sc.nextInt();
		System.out.print("Enter the number 2 :");
		int num2 = sc.nextInt();
		System.out.print("Enter the number 3 :");
		int num3 = sc.nextInt();
		if(num1>num2 && num1 >num3) {
			System.out.println("Greater Number is : "+num1);
		}
		else if(num2>num1 && num2>num3) {
			System.out.println("Greater Number is : "+num2);
		}
		else {
			System.out.println("Greater Number is : "+num3);
		}
		sc.close();
	}

}
