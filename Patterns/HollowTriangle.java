package Patterns;

public class HollowTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		for(int i=1;i<=n;i++) {
			for(int j=i;j<n;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				if(i==n || j==1 || j==i )
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
