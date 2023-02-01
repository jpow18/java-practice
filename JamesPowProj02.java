
/**
 * This program takes user input (int) representing an amount of cents
 * and returns the amount of change (in the appropriate denominations)
 * @author James Pow
 * Project 02
 */
import java.util.Scanner;
import java.util.InputMismatchException;

public class JamesPowProj02
{
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        final int QUARTERS = 25;
        final int DIMES = 10;
        final int NICKELS = 5;
        int moneyAmount = 0;
        while (true) {
            try {
                do { // catch any invalid integer input
                    System.out.print("Enter a change between 1 and 99 cents: ");
                    moneyAmount = input.nextInt();
                    if (moneyAmount > 99 || moneyAmount < 1) {
                        System.out.println("Value must be " +
                        "between 1 and 99.");
                    }
                } while (moneyAmount > 99 || moneyAmount < 1);
                break;
            } catch (InputMismatchException e) { // catch any non-integer input
                System.out.println("Invalid input. Please enter an integer.");
                input.next();
            }
        }
        
    }
}
