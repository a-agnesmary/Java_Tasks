package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TransponseMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int row = sc.nextInt();
		System.out.print("Enter the number of columns : ");
		int col = sc.nextInt();
		System.out.println("Enter the array elements : ");
		int[][] arr = new int[row][col];
		int[][] transponseArray = new int[col][row];
		int rowIdx = 0;
		int colIdx = 0;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=sc.nextInt();
				transponseArray[rowIdx][colIdx] =arr[i][j];
				rowIdx++;
			}
			colIdx++;
			rowIdx=0;
		}
		System.out.println("Original Array : "+Arrays.deepToString(arr));
		System.out.println("Transponse Array : "+Arrays.deepToString(transponseArray));
		sc.close();
	}
}
