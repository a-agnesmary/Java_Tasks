package LinkedListAssignment;

import java.util.LinkedList;
import java.util.List;

public class ReverseLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Character> letters = new LinkedList<>();
		letters.add('A');
		letters.add('B');
		letters.add('C');
		letters.add('D');
		letters.add('E');
		System.out.println(" Using in-built method : " +letters.reversed()); // in buit method
		for(int i=0,j=0;i<j;i++,j++) {
			char temp = letters.get(i);
			letters.set(i, letters.get(j));
			letters.set(j, temp);			
		}
		System.out.println(" Using manual reversed : " +letters.reversed());
	}

}
