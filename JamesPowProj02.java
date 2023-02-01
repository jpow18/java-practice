
/**
 * This program takes user input (int) representing an amount of cents
 * and returns the amount of change (in the appropriate denominations)
 * @author James Pow
 * Project 02
 */
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;
public class JamesPowProj02
{
    public static void main (String[] args) {
        // create new instance of scanner class
        Scanner input = new Scanner(System.in);
        
        // This variable holds total amount of change
        int moneyAmount = 0;
        /*while (true) {
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
        }*/
        
        // create new instance of a Random object
        Random random = new Random();
        
        // declare constants to clarify meaning of code
        final int QUARTERS = 25;
        final int DIMES = 10;
        final int NICKELS = 5;
        
        // generate a random number between 1 and 99 inclusive
        moneyAmount = random.nextInt(100);
        int numQuarters = moneyAmount / QUARTERS;
        int remainingChange = moneyAmount % QUARTERS;
        int numDimes = remainingChange / DIMES;
        remainingChange = remainingChange % DIMES;
        int numNickels = remainingChange / NICKELS;
        remainingChange = remainingChange % NICKELS;
        // Any amount left in remainingChange is the number of pennies
        
        // print results
        System.out.printf("You have change %d cents. That is:\n" +
        "%d quarters\n%d dimes\n%d nickels\n%d pennies", moneyAmount, 
        numQuarters, numDimes, numNickels, remainingChange);
    }
}
