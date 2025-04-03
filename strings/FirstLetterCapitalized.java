package strings;

import java.util.Scanner;

public class FirstLetterCapitalized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str = sc.nextLine().trim();
		
		StringBuilder ans = new StringBuilder();
		String temp ="";
		for(int i=0;i<str.length();i++) {
			temp+=str.charAt(i);
			if(str.charAt(i)==' ' || i== str.length()-1) {
				ans.append( (char)(temp.charAt(0)-32)+temp.substring(1) );
				temp ="";
			}
		}
		System.out.println("Output : "+ans.toString());
		sc.close();
	}
}

//Enter the string : hello world
//Output : Hello World