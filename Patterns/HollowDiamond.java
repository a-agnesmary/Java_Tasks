package Patterns;

public class HollowDiamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		for(int i=0;i<n;i++){
			for(int j=i;j<n;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				if(j==0 ||j==i) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
            System.out.println();
        }
        for(int i=1;i<n;i++){
        	for(int j=0;j<=i;j++) {
        		System.out.print(" ");
        	}
        	for(int j=n-i;j>=1;j--) {
        		if(j==n-i ||j==1) {
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
