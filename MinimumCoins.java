import java.util.Scanner;
import java.util.InputMismatchException;
public class MinimumCoins
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // variable to hold input amount
        double moneyAmount;
        
        // while loop to allow user more attempts if they input
        // data incorrectly on an attempt. try/catch to handle exceptions
        while (true) {
            try {
                System.out.print("Please enter dollar amount in the " +
                "following format DD.CC to recieve correct change: ");
                moneyAmount = input.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter " +
                "double.");
                input.next();
            }
        }
        
        // get amount in cents
        int totalCents = (int) (moneyAmount * 100);
        
        // get dollars, quarters, dimes, nickels, pennies 
        // maximum amounts of each
        int dollars = totalCents / 100;
        int remainingCents = totalCents % 100;
        int quarters = remainingCents / 25;
        remainingCents %= 25;
        int dimes = remainingCents / 10;
        remainingCents %= 10;
        int nickels = remainingCents / 5;
        remainingCents %= 5;
        int pennies = remainingCents;
        
        // display results
        System.out.printf("Your change from the given amount of: $%.2f\n" +
        " Dollars: %d\n Quarters: %d\n Dimes: %d\n Nickels: %d\n" +
        " Pennies: %d\n", moneyAmount, dollars, quarters, dimes, nickels,
        pennies);

    }
}
