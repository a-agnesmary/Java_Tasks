package Patterns;

public class NumberChangingPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int start = 1;
		for(int i=0;i<n;i++) {
			for(int k=0;k<=i;k++) {
				System.out.print(start++ + " ");
			}
			System.out.println();
		}
	}

}