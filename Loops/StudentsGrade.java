package Loops;

import java.util.Scanner;

public class StudentsGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		if(score >=90 && score<=100) {
			System.out.println("Excellent");
		}
		else if(score >=70 && score<90) {
			System.out.println("Good");
		}
		else if(score >=50 && score<69) {
			System.out.println("Fair");
		}
		else {
			System.out.println("Poor");
		}
		sc.close();
	}

}
