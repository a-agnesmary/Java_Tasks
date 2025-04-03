package Loops;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		System.out.println("*** Multiplication Table of "+num+" ***");
		for(int i=1;i<=10;i++) {
			System.out.println(i+" * "+num+" = "+(i*num));
		}
		sc.close();
	}

}
