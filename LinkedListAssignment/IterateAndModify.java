package LinkedListAssignment;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class IterateAndModify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> fruits = new LinkedList<>();
		fruits.add("one");
		fruits.add("two");
		fruits.add("three");
		fruits.add("four");
		fruits.add("five");
		
		ListIterator<String> itr = fruits.listIterator();
		while(itr.hasNext()) {
			String str = (String) itr.next();
			if(str.equals("three")) {
				itr.set("THREE");
			}
		}
		System.out.println(fruits);
	}

}
