package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SpiralMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of N : ");
		int N = sc.nextInt();
		int[][] arr = new int[N][N];
		int row=0,col= N-1;
		int count=1;
		while(row<col) {
			for(int i=row;i<=col;i++) {
				arr[row][i]= count++;
			}
			for(int i=row+1;i<=col;i++) {
				arr[i][col]= count++;
			}
			for(int i=col-1;i>=row;i--) {
				arr[col][i]= count++;
			}
			for(int i=col-1;i>row;i--) {
				arr[i][row]= count++;
			}
			row++;
			col--;
		}
		System.out.println(Arrays.deepToString(arr));
		sc.close();
	}

}
