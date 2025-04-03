package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int row_1 = sc.nextInt();
		System.out.print("Enter the number of columns : ");
		int col_1 = sc.nextInt();
		System.out.println("Enter the array elements : ");
		int[][] arr_1 = new int[row_1][col_1];
		
		System.out.print("Enter the number of rows: ");
		int row_2 = sc.nextInt();
		System.out.print("Enter the number of columns : ");
		int col_2 = sc.nextInt();
		System.out.println("Enter the array elements : ");
		int[][] arr_2 = new int[row_2][col_2];

        if (col_1 != row_2) {
            System.out.println("Matrix multiplication is not possible.");
        }
        else {
        	int[][] ans = new int[row_1][col_2];
            for (int i = 0; i < row_1; i++) {
                for (int j = 0; j < col_2; j++) {
                    for (int k = 0; k < col_1; k++) {
                        ans[i][j] += arr_1[i][k] * arr_2[k][j];
                    }
                }
            }
            System.out.println("Resultant Matrix:"+Arrays.deepToString(ans));
        }
        sc.close();
       
	}

}
