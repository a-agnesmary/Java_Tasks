package strings;
import java.util.*;

public class VowelsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str = sc.nextLine();
		
		int count =0;
		String vowels = "aeiouAEIOU";
		for(char ch : str.toCharArray()) {
			if(vowels.indexOf(ch) != -1) {
				count++;
			}
		}
		System.out.println("Number of vowels in the given string: " + count);
		sc.close();
	}
}