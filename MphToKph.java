import java.util.Scanner;
import java.util.InputMismatchException;

public class MphToKph
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double inputMiles; // user will input
        final double KILOMETERS_PER_MILE = 1.609;
        while (true) {
            try {
                System.out.print("Enter a double value: ");
                inputMiles = input.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a double.");
                input.next();
            }
        }
        
        // calculate kilometers per hour
        double kilometers = inputMiles * KILOMETERS_PER_MILE;
        // display result
        System.out.printf("%.1fmph converted to kmh is : %.3fkmh", inputMiles, kilometers); 
        input.close(); // close the scanner class
    }
}
