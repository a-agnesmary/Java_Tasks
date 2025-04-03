package scope_and_operators;

import java.util.*;
public class CelsiusToFahrenhit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float celsius = sc.nextFloat();
		float Fahrenhit = (celsius*9)/5 + 32;
		System.out.println(celsius+"°C to "+Fahrenhit+" °F");
		sc.close();
	}

}
