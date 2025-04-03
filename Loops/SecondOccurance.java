package Loops;

import java.util.Scanner;

public class SecondOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the array size : ");
		int size = sc.nextInt();
		System.out.print("Enter the array Elements : ");
		int[] arr = new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the search number : ");
		int searchNum = sc.nextInt();
		int[] count = new int[searchNum+1];
		boolean found = true;
		for(int i=0;i<size;i++) {
			if(arr[i] <= searchNum) {
				if(count[arr[i]] ==1) {
					System.out.println("Find the second occurance index of the number is : "+i);
					found = false;
					break;
				}
				else {
					count[arr[i]]++;
				}
			}
		}
		if(found) {
			System.out.println("Not found !");
		}
		sc.close();
	}

}
