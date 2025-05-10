package ArrayListAssignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InterateAndRemoveElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		
		Iterator<Integer> itr = numbers.iterator();
		while(itr.hasNext()) {
			int n = (int) itr.next();
			if(n>30) {
				itr.remove();
			}
		}
		System.out.println(numbers);
	}

}
