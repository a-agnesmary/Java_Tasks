package LinkedListAssignment;

import java.util.LinkedList;
import java.util.List;

public class AddAndRetrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = new LinkedList<>();
		numbers.add(5);
		numbers.add(10);
		numbers.add(15);
		numbers.add(20);
		numbers.add(25);
		System.out.println("List of Elements : "+numbers);
		System.out.println("First Element : "+numbers.getFirst());
		System.out.println("First Element : "+numbers.getLast());
	}

}
