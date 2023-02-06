
/**
 * Program asks user for an integer input and returns the corresponding
 * letter grade such a score would recieve
 *
 * James Pow
 * Project 3
 * 2/6/23
 */

import java.util.Scanner;
import java.util.InputMismatchException;
public class James_Pow_Project03
{
    public static void main(String[] args) {
        // Create new Scanner object
        Scanner input = new Scanner(System.in);
        
        // Declare variable to hold user input
        int answer;
        
        // This loop enables user to repeat program
        while (true) {
            // This while/try/catch ensures an integer as input
            while (true) {
                try {
                    // This do/while loop ensures the user input is in the valid range 
                    do {
                        System.out.print("Enter your score (0-100): ");
                        answer = input.nextInt();
                        // Clean buffer
                        input.nextLine();
                        
                        // Output error message if the input is out of range
                        if (answer > 100 || answer < 0)
                            System.out.println("Enter an integer between 0 and 100");
                            
                    } while (answer > 100 || answer < 0);
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Enter an integer");
                    input.next();
                }
            }
            
            // Print grade using if-else function
            //System.out.println("Your grade is: " + computeGrade(answer));
            
            // Print grade using switch function
            System.out.println("Your grade is: " + computeGradeSwitch(answer));
            
            // Ask user to repeat program
            System.out.print("Would you like to play again? Yes/No ");
            String repeat = input.nextLine();
            if (repeat.toLowerCase().equals("yes")) {
                continue;
            } else {
                System.out.println("Thanks for playing!");
                break;
            }
        }
        
    }
    
    public static char computeGrade(int score) {
        if (score >= 90)
            return 'A';
        else if (score >= 80)
            return 'B';
        else if (score >= 70)
            return 'C';
        else if (score >= 60)
            return 'D';
        else 
            return 'F';
        }
        
    public static char computeGradeSwitch(int score) {
        switch (score) {
            case 100, 99, 98, 97, 96, 95, 94, 93, 92, 91, 90 -> {
                return 'A';
            }
            case 89, 88, 87, 86, 85, 84, 83, 82, 81, 80 -> {
                return 'B';
            }
            case 79, 78, 77, 76, 75, 74, 73, 72, 71, 70 -> {
                return 'C';
            }
            case 69, 68, 67, 66, 65, 64, 63, 62, 61, 60 -> {
                return 'D';
            }
            default -> {
                return 'F';
            }
        }
    }
}
