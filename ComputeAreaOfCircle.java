import java.util.Scanner;
import java.util.InputMismatchException;

public class ComputeAreaOfCircle
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius = 0;
        final double PI = 3.14159;
        // catch the error produced if user doesn't enter a double
        while (true) {
            try {
                // user prompt
                System.out.print("Enter a number for radius: ");
                radius = input.nextDouble();
                break;
            } catch (InputMismatchException error) {
                System.out.println("Invalid input. Please enter a double.");
                input.nextLine();
            }
        }
        // calculate area
        double area = radius * radius * 3.14159;
        // display result
        System.out.printf("The area for a circle of radius %.1f is %.5f.\n",radius,area);
        input.close();
    }
}
