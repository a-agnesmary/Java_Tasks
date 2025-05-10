package LinkedListAssignment;

import java.util.LinkedList;
import java.util.Queue;

public class QueueBehaviour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> names = new LinkedList<>();
		names.add("Alice");
		names.add("Bob");
		names.add("Charlie");
		names.add("Diana");
		System.out.println(names);
		names.remove();
		names.remove();
		System.out.println("After remove : "+names);
		
	}

}
