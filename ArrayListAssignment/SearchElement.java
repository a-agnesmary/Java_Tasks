package ArrayListAssignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Character> numbers = new ArrayList<>();
		numbers.add('0');
		numbers.add('1');
		numbers.add('2');
		numbers.add('3');
		numbers.add('4');
		numbers.add('5');
		numbers.add('6');
		numbers.add('7');
		numbers.add('8');
		numbers.add('9');
		
		System.out.println("Enter the search character : ");
		char ch = sc.next().charAt(0);
		System.out.println("The index of "+ch+" is : "+search(ch,numbers));
		sc.close();
	}
	private static int search(char ch,List<Character> numbers) {
		for(int i=0;i<numbers.size();i++) {
			if(numbers.get(i)==ch) {
				return i;
			}
		}
		return -1;
	}

}
