package Recursion;

import java.util.Scanner;

public class digitsToWord {
	private final static String[] belowTwenty = {"","One","Two","Three","Four","Five", "Six",     "Seven",     "Eight",    "Nine",
						            "Ten",     "Eleven",  "Twelve",    "Thirteen", "Fourteen",
						            "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
	private final static String[] tens = {"",      "",      "Twenty",  "Thirty", "Forty",
	     "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		System.out.println(numberToWords(num));
		sc.close();
	}
	
	public static String numberToWords(int num) {
		return num==0?"Zero":helper(num);
	}
	
	public static String helper(int num){
		StringBuilder result = new StringBuilder();
		if(num<20){
			result.append(belowTwenty[num]);
		}
		else if(num<100) {
			result.append(tens[num/10]).append(" ").append(belowTwenty[num%10]);
		}
		else if (num < 1000) {
			result.append(belowTwenty[num/100]).append(" Hundred ").append(helper(num%100));
		}
		else if (num < 1000000) {
			result.append(helper(num/1000)).append(" Thousand ").append(helper(num%1000));
		}
		else if (num < 1000000000) {
			result.append(helper(num/1000000)).append(" Million ").append(helper(num%1000000));
		}
		else {
			result.append(helper(num / 1000000000)).append(" Billion ").append(helper(num % 1000000000));
		} 
		return result.toString().trim();
	}

}
