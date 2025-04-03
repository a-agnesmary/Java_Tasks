package data_types;

import java.util.*;

enum weekday{
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}
public class WeekDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the day (1-7) : ");
		int dayNumber = sc.nextInt();
		if (dayNumber < 1 || dayNumber > 7) {
           System.out.println("Invalid Day !");
        }
		else
			System.out.println("Day is : "+weekday.values()[dayNumber - 1]); 
		sc.close();
	}

}
