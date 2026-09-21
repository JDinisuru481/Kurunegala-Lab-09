import java.util.Scanner;

public class it26100481Lab0901 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double a, b, c;
        double x1, x2, discriminant;

        System.out.print("Enter value for a: ");
        double a = input.nextDouble();

        System.out.print("Enter value for b: ");
        double b = input.nextDouble();

        System.out.print("Enter value for c: ");
        double c = input.nextDouble();

        discriminant = Math.pow(b, 2) - (4 * a * c);

        if (discriminant > 0) {
            x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            x2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            System.out.println("Root 1 = " + x1);
            System.out.println("Root 2 = " + x2);
        }
        
        else if (discriminant == 0) {
            x1 = -b / (2 * a);
            System.out.println("Both roots are equal");
            System.out.println("Root = " + x1);
        }
        else {
            System.out.println("No real roots exist.");
        }

        input.close();
    }
}
