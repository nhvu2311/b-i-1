Java
import java.util.Scanner;

public class QuadraticEquationSolver {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get coefficients from the user
        System.out.print("Enter the coefficient a: ");
        double a = sc.nextDouble();

        System.out.print("Enter the coefficient b: ");
        double b = sc.nextDouble();

        System.out.print("Enter the constant term c: ");
        double c = sc.nextDouble();

        // Solve the quadratic equation
        double discriminant = b * b - 4.0 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2.0 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2.0 * a);

            System.out.println("The roots are:");
            System.out.println("x1 = " + root1);
            System.out.println("x2 = " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2.0 * a);
            System.out.println("The root is:");
            System.out.println("x = " + root);
        } else {
            System.out.println("The equation has no real roots.");
        }
    }
}