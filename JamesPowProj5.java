
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
        int principle;
        int termLength;
        double interestRate;
        Scanner input = new Scanner(System.in);
        // Loop to allow user to repeat the program
        while (true) {            
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
            
            // Instantiate new object of MortgageCalculator class
            MortgageCalculator mortgage = new MortgageCalculator(
            principle, termLength, interestRate);
            
            System.out.printf("Payment: $%.2f", mortgage.monthlyPayment());
            break;
        }
        
    }
    
}

class MortgageCalculator{
    private int principle;
    private int termLength;
    private double interestRate;
    
    // Constructor
    public MortgageCalculator(int principle,int termLength,
    double interestRate) {
        this.principle = principle;
        this.termLength = termLength;
        this.interestRate = interestRate;
    }
    
    // Calculate monthly payment
    public double monthlyPayment() {
        double interestRate = this.interestRate / 12;
        int term = this.termLength * 12;
        
        double monthlyPayment = (((this.principle * interestRate) * 
        (Math.pow(1 + interestRate, term))) / 
        ((Math.pow(1 + interestRate, term)) - 1));
        
        return monthlyPayment;
    }
}
