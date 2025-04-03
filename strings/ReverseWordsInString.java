
package strings;

import java.util.Scanner;

public class ReverseWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str = sc.nextLine().trim();
		String ans = "";
		String temp ="";
		for(int i=0;i<str.length();i++) {
			if(i==str.length()-1) {
				ans += str.charAt(i)+temp;
			}
			if(str.charAt(i)==' ') {
				ans += temp+' ';
				temp ="";
			}
			temp = str.charAt(i)+temp;
		}
		System.out.println("Reverse String : "+ans);
		sc.close();
	}
//	Enter the string : hello world
//	Reverse String : olleh dlrow 
}
