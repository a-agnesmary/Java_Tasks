package LinkedListAssignment;

import java.util.LinkedList;
import java.util.List;

public class LinkedListOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = new LinkedList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		numbers.add(9);
		numbers.add(10);
		
		numbers.remove(2);
		numbers.removeLast();
		System.out.println("List of Elements : "+numbers);

	}

}
