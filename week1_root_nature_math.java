import java.util.*;
public class week1_root_nature_math {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        // Calculate the discriminant D
        double D = b * b - 4 * a * c;
        System.out.println("Discriminant (D) = " + D);

        // Determine the nature of the roots based on D
        if (D > 0) {
            // Two distinct real roots
            double root1 = (-b + Math.sqrt(D)) / (2 * a);
            double root2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("The equation has two distinct real roots: ");
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);
        } else if (D == 0) {
            // One real root (repeated root)
            double root = -b / (2 * a);
            System.out.println("The equation has one real root (repeated): ");
            System.out.println("Root = " + root);
        } else {
            // Two complex roots
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-D) / (2 * a);
            System.out.println("The equation has two complex roots: ");
            System.out.println("Root 1 = " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2 = " + realPart + " - " + imaginaryPart + "i");
        }

        scanner.close();
    }
}
