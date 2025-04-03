package Loops;

import java.util.Scanner;

public class FindEvenNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the array size : ");
		int size = sc.nextInt();
		System.out.print("Enter the array Elements : ");
		int[] arr = new int[size];
		int sum =0;
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++) {
			if(arr[i]%2!=0)
				continue;
			sum+=arr[i];
		}
		System.out.println("Even elements sum is : "+sum);
		sc.close();
	}

}
