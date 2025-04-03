package scope_and_operators;

import java.util.Scanner;

public class BitwiseOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("AND :"+(num1&num2));
		System.out.println("OR :"+(num1|num2));
		System.out.println("XOR :"+(num1^num2));
		System.out.println("RIGHT SHIFT :"+(num1<<num2));
		System.out.println("LEFT SHIFT  :"+(num1>>num2));
		sc.close();
	}

}
