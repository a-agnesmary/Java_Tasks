package Patterns;

public class NumberIncreaseReversePyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 5;
		for(int i=0;i<n;i++) {
			int start =1;
			for(int k=i;k<n;k++) {
				System.out.print(start++ + " ");
			}
			System.out.println();
		}
	}

}