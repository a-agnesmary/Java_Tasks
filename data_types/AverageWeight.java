package data_types;

import java.util.Scanner;

public class AverageWeight {

	public static void main(String[] args) {
		final int NUMBER_OF_PEOPLE = 10; 
        double[] weights = new double[NUMBER_OF_PEOPLE]; 
        double totalWeight = 0.0; 
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the weights of " + NUMBER_OF_PEOPLE + " people (in kg)");
        for (int i = 0; i < NUMBER_OF_PEOPLE; i++) {
            System.out.print("Enter weight for person " + (i + 1) + ": ");
            weights[i] = sc.nextDouble();
            totalWeight += weights[i]; 
        }
        double averageWeight = totalWeight / NUMBER_OF_PEOPLE;
        System.out.println("The average weight of " + NUMBER_OF_PEOPLE +" people is: "+averageWeight+"kg");;
        sc.close();
	}

}
