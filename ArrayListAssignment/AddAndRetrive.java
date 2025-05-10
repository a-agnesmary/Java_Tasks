package ArrayListAssignment;

import java.util.ArrayList;
import java.util.List;

public class AddAndRetrive {
	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Cherry");
		fruits.add("Mango");
		fruits.add("Banana");
		System.out.println(fruits);
		System.out.println("Third fruit in the list : "+fruits.get(2));
	}
}
