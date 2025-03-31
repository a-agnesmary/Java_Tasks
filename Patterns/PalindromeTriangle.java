package Patterns;

public class PalindromeTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		for(int i=1;i<=n;i++) {
			for(int j=i;j<n;j++) {
				System.out.print(" ");
			}
			int start = i;
			for(int k=1;k<=i;k++) {
				System.out.print(start--);
			}
			start++;
			for(int l=1;l<i;l++) {
				System.out.print(++start);
			}
			System.out.println();
		}
	}
}