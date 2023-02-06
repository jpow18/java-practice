
/**
 * Asks the user what the sum of two randomly generated integers are. Checks
 * user input and lets them know if they are correct or not.
 */
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;
public class AdditionQuiz
{
    public static void main(String[] args) {
        // while loop to allow repeated rounds of questions
        while (true) {
            // generate two random integers
            Random random = new Random();
            int addend1 = random.nextInt(10);
            int addend2 = random.nextInt(10);
            
            // print out question
            System.out.printf("What is %d + %d? ", addend1, addend2);
            
            // create instance of scanner class and declar variable to hold
            // the user's answer
            Scanner input = new Scanner(System.in);
            int answer;
            // while/try/catch block for user input
            while (true) {
                try {
                    answer = input.nextInt();
                    // clean up the buffer
                    input.nextLine();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Please enter an integer.");
                    input.next();
                    continue;
                }
            }
            
            // check answer and print result
            if (answer == addend1 + addend2) {
                System.out.printf("Yes, %d + %d is equal to %d\n", addend1, addend2, answer);
            } else {
                System.out.printf("Sorry. Your answer of %d is incorrect." +
                " The correct answer is %d.\n", answer, addend1 + addend2);
            }
            
            // quit or continue
            System.out.print("Would you like to do another round? ");
            String repeat;
            while (true) {
                try {
                    repeat = input.nextLine();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Please enter a string.");
                }
            }
            if (repeat.toLowerCase().equals("yes")) 
                continue;
            else {
                System.out.println("Thanks for taking our quiz!");
                break;
            } 
        }
    }
}
