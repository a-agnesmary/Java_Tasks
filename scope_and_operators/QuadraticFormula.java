package scope_and_operators;

import java.util.Scanner;

public class QuadraticFormula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter coefficient a: ");
        double a = sc.nextDouble();

        System.out.print("Enter coefficient b: ");
        double b = sc.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = sc.nextDouble();

        double discriminant = (b * b) - (4 * a * c);

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The equation has two real roots: x = "+root1+" or x = "+ root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.printf("The equation has one real root: x = "+root);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("The equation has complex roots: x = " + realPart + " ± " + imaginaryPart + "i");
        }

        sc.close();
    }
}
