
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
        char repeat = 'y';
        Scanner input = new Scanner(System.in);
        
        // Loop to allow user to repeat the program
        while (repeat == 'y') {            
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
            
            // Store payment amount in variable to minimize method
            // calls in the loop
            double monthlyPayment = mortgage.monthlyPayment();
            int month;
            System.out.println("Month   Payment   Total Interest   Balance");
            // For loop to calculate and output information
            /*for (month = 1; month <= termLength * 12; month++) {
                if (month <= 5) { // Ensure proper formatting
                    System.out.printf("   %d    $%.2f    $%.2f       $%.2f\n",
                    month, monthlyPayment, mortgage.totalInterestPaid(month),
                    mortgage.balanceEndOfMonth(month));
                } else if (month < 10) {
                    System.out.printf("   %d    $%.2f    $%.2f      $%.2f\n",
                    month, monthlyPayment, mortgage.totalInterestPaid(month),
                    mortgage.balanceEndOfMonth(month));
                } else {
                    System.out.printf("  %d    $%.2f    $%.2f      $%.2f\n",
                    month, monthlyPayment, mortgage.totalInterestPaid(month),
                    mortgage.balanceEndOfMonth(month));
                }
            }*/
            
            // While loop to calculate and output information
            month = 1;
            while (month <= termLength * 12) {
                if (month <= 5) { // Ensure proper formatting
                    System.out.printf("   %d    $%.2f    $%.2f       $%.2f\n",
                    month, monthlyPayment, mortgage.totalInterestPaid(month),
                    mortgage.balanceEndOfMonth(month));
                } else if (month < 10) {
                    System.out.printf("   %d    $%.2f    $%.2f      $%.2f\n",
                    month, monthlyPayment, mortgage.totalInterestPaid(month),
                    mortgage.balanceEndOfMonth(month));
                } else {
                    System.out.printf("  %d    $%.2f    $%.2f      $%.2f\n",
                    month, monthlyPayment, mortgage.totalInterestPaid(month),
                    mortgage.balanceEndOfMonth(month));
                }
                month++;
            }
            
            System.out.print("Would you like to calculate another " +
            "mortgage? Y/N ");
            repeat = input.nextLine().charAt(0);
            repeat = Character.toLowerCase(repeat);
        }
        System.out.println("\nHope you found this useful! Goodbye!");
    }
    
}

class MortgageCalculator{
    private int principle;
    private int termLength;
    private double interestRate;
    private double balance;
    private double interestPaid;
    
    // Constructor
    public MortgageCalculator(int principle,int termLength,
    double interestRate) {
        this.principle = principle;
        this.balance = principle;
        this.termLength = termLength * 12;
        this.interestRate = interestRate / 12;
    }
    
    // Calculate monthly payment
    public double monthlyPayment() {      
        double monthlyPayment = ((this.principle * this.interestRate) * 
        (Math.pow(1 + this.interestRate, this.termLength))) / 
        ((Math.pow(1 + this.interestRate, this.termLength)) - 1);
        
        return monthlyPayment;
    }
    
    public double balanceEndOfMonth(int month) {
        this.balance = 
        ((Math.pow(1 + this.interestRate, month) * this.principle) -
        (((Math.pow(1 + this.interestRate, month) - 1) * this.monthlyPayment())
        / this.interestRate));
        return this.balance;
    }
    
    public double totalInterestPaid(int month) {
        return (this.monthlyPayment() * month) - 
        (this.principle - this.balanceEndOfMonth(month));
    }
}
