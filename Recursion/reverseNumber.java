package Recursion;

import java.util.Scanner;
public class reverseNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		System.out.println(reverse(num,0));
		sc.close();
	}

	private static int reverse(int n, int rev) {
		// TODO Auto-generated method stub
		if(n < 10) {
			return rev*10+n;
		}
		rev = rev*10+n%10 ;
		return reverse(n/10,rev);
	}

}
