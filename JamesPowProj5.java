
/**
 * This program takes user input regarding their mortgage 
 * and prints the resulting amortization table
 *
 * James Pow
 * 2/21/23
 */

import java.util.InputMismatchException;
import java.util.Scanner;
public class JamesPowProj5
{
    public static void main(String[] args) {
        // Loop to allow user to repeat the program
        while (true) {
            int principle;
            int termLength;
            double interestRate;
            Scanner input = new Scanner(System.in);
            
            // Loops to ensure user enters valid data
            while (true) {
                try { // try/catch for principle
                    System.out.print("Enter the principle to borrow: ");
                    principle = input.nextInt();
                    input.nextLine(); // Clean up the input buffer
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Please enter a valid integer");
                    input.nextLine(); // Clean up the input buffer
                }
            }
            while (true) {
                try { // try/catch for interest rate
                    System.out.print("Enter the interest rate " +
                    "in decimal: ");
                    interestRate = input.nextDouble();
                    input.nextLine(); // Clean up the input buffer
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Please enter a valid integer");
                    input.nextLine(); // Clean up the input buffer
                }
            }
            while (true) {
                try { // try/catch for principle
                    System.out.print("Enter the term (in years): ");
                    termLength = input.nextInt();
                    input.nextLine();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Please enter a valid integer");
                    input.nextLine(); // Clean up the input buffer
                }
            }
            
            System.out.printf("Payment: $%.2f", monthlyPayment(principle, termLength, interestRate));
            break;
        }
        
    }
    
    
    public static double monthlyPayment(int principle, int term,
    double interestRate) {
        interestRate = interestRate / 12;
        term = term * 12;
        
        double monthlyPayment = (((principle * interestRate) * 
        (Math.pow(1 + interestRate, term))) / 
        ((Math.pow(1 + interestRate, term)) - 1));
        
        return monthlyPayment;
        
    }
}
