package ArrayListAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortTheList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = new ArrayList<>();
		
		
		for(int i=0;i<10;i++) {
			numbers.add((int)((Math.random()*100)+1));
		}
		System.out.println(numbers);
		Collections.sort(numbers);
		System.out.println("Sorted List : "+numbers);
		
		// sort using comparator
		numbers.clear();
		for(int i=0;i<10;i++) {
			numbers.add((int)((Math.random()*100)+1));
		}
		System.out.println("\nsort using comparator"+"\n"+numbers);
		Collections.sort(numbers, (a,b)-> a-b);
		System.out.println("Sorted List : "+numbers);

		//sort manually
		numbers.clear();
		for(int i=0;i<10;i++) {
			numbers.add((int)((Math.random()*100)+1));
		}
		System.out.println("\nsort by manual "+"\n"+numbers);
		sortList(numbers);
		System.out.println("Sorted List : "+numbers);
	}

	private static void sortList(List<Integer> numbers) {
		for(int i=0;i<numbers.size()-1;i++) {
			for(int j=0;j<numbers.size()-i-1;j++) {
				if(numbers.get(j) >numbers.get(j+1)) {
					int temp = numbers.get(j);
					numbers.set(j, numbers.get(j+1));
					numbers.set(j+1, temp);
				}
			}
		}
		
	}

}
