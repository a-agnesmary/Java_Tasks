package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {

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
		System.out.println("Enter the rotation count : ");
		int count = sc.nextInt();
		count = count%size;
		reverse(arr,0,count-1);
		reverse(arr,count,size-1);
		reverse(arr,0,size-1);
		System.out.println("Rotated Array : "+Arrays.toString(arr));
		sc.close();
	}

	private static void reverse(int[] arr, int start ,int end) {
		// TODO Auto-generated method stub
		while(start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
}
