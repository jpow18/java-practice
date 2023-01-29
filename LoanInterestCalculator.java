import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.Math;

public class LoanInterestCalculator
{
    public static void main(String[] args) {
        // prompt user for annual interest rate, the number
        // of years, and the loan amount
        Scanner input = new Scanner(System.in);
        
        // variables for holding the input
        double interestRate, loanLength, loanAmount;
        while (true) {
            // multiple while, try/catch so user doesn't need to reenter any
            // prior valid input if they make a mistake
            try {
                System.out.print("Please enter the annual interest rate"
                + " of your loan: ");
                interestRate = input.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.print("Invalid input. Please enter a double");
                input.next();
            }
        }
        while (true) {
            try {
                System.out.print("Please enter the length of your" 
                + " of your loan: ");
                loanLength = input.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.print("Invalid input. Please enter a double");
                input.next();
            }
        }
        while (true) {
            try {
                System.out.print("Please enter the loan amount: ");
                loanAmount = input.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.print("Invalid input. Please enter a double");
                input.next();
            }
        }
    
        // calculate monthly interest, monthly payments, and total payment
        double monthlyInterestRate = interestRate / 1200;
        double monthlyPayment = (loanAmount * monthlyInterestRate) / 
        (1 - 1/Math.pow(1 + monthlyInterestRate, loanLength * 12));
        // calculate total payment
        double totalPayment = monthlyPayment * 12 * loanLength;
        
        // display results
        System.out.printf("The monthly payments of your loan are $%.3f " +
        " and the total payment amount over the lifetime of your loan " +
        "is $%.2f.\n", monthlyPayment, totalPayment);
        
        System.out.println("Thanks for using the loan interest" 
        + " calculator");
        input.close();
    }
}

