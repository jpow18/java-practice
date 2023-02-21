
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
        char repeat = 'Y';
        Scanner input = new Scanner(System.in);
        
        // Loop to allow user to repeat the program
        while (repeat == 'Y') {            
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
            
            
            
            System.out.print("Would you like to calculate another " +
            "mortgage? Y/N ");
            repeat = input.nextLine().charAt(0);
        }
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
