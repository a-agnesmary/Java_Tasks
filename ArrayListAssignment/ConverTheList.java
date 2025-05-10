package ArrayListAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConverTheList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Cherry");
		
		String[] arr = fruits.toArray(new String[0]);
		List<String> fruits2 = new ArrayList<>(Arrays.asList(arr));

		
//		String[] arr = new String[fruits.size()];
//		for(int i=0;i<fruits.size();i++) {
//			arr[i] = fruits.get(i);
//		}
		System.out.println("Convert List into Array  : "+Arrays.toString(arr));
//		
//		List<String> fruits2 = new ArrayList<>();
//		for(int i=0;i<arr.length;i++) {
//			fruits2.add(arr[i]);
//		}
		System.out.println("Convert Array into List  : "+fruits2);
	}

}
