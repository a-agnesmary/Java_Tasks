package Patterns;

public class HollowHourGlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<=n-i;j++) {
				if(i==0 || j==0 ||j==n-i)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++) {
			for(int j=i;j<n;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				if(i==n || j==0||j==i) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
		
	}

}
