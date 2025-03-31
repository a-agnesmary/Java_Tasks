package Patterns;

public class NumberTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 5;
		int start =1;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print(start + " ");
			}
			start++;
			System.out.println();
		}
	}

}