package strings;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str = sc.nextLine();
		
		char[] arr = str.toCharArray();
		int i=0,j=str.length()-1;
		while(i<j) {
			char temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		System.out.println("Reverse String : "+String.valueOf(arr));
		sc.close();
	}

}