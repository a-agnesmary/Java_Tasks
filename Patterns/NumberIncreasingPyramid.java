
package Patterns;

public class NumberIncreasingPyramid {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 5;
		for(int i=0;i<n;i++) {
			int start =1;
			for(int k=0;k<=i;k++) {
				System.out.print(start++ + " ");
			}
			System.out.println();
		}
	}
}
