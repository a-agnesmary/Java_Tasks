package Patterns;

public class MirrorImageTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int i=1;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				System.out.print(" ");
			}
			for(int j=n-i;j<=n;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
