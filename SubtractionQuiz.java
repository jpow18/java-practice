
/**
 * Program generates two random numbers, asks user what the addend1 - addend2
 * equals, checks user input and tells them whether they were right or not
 */
import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;
public class SubtractionQuiz
{
    public static void main(String[] args) {
        // loop to allow multiple rounds
        while (true) {
            // Generate two random numbers
            Random random = new Random();
            int int1 = random.nextInt(20);
            int int2 = random.nextInt(20);
            
            // check values and swap if needed to avoid negative numbers
            if (int1 < int2) {
                int[] arr = {int1, int2};
                swap(arr);
                int1 = arr[0];
                int2 = arr[1];
            }
            
            // Ask question
            System.out.printf("What is %d - %d? ", int1, int2);
            
            // create new Scanner object
            Scanner input = new Scanner(System.in);
            int answer;
            while (true) {
                try {
                    answer = input.nextInt();
                    // clean up buffer
                    input.nextLine();
                    break;
                } catch (InputMismatchException e) {
                    System.out.print("Please enter an integer: ");
                    input.next();
                }
            }
            
            // check answer, print result
            if (int1 - int2 == answer) {
                System.out.printf("Yes. %d - %d is equal to %d\n", int1, int2, answer);
            } else {
                System.out.printf("No. %d - %d is not equal to %d." +
                "\nThe correct answer is %d\n", int1, int2, answer, int1 - int2);
            }
            
            System.out.print("Would you like to go again? ");
            String repeat = input.nextLine();
            if (repeat.toLowerCase().equals("yes"))
                continue;
            else {
                System.out.println("Thank you for playing!");
                break;
            }
        }
    }
        
    // Swap method
    public static void swap(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
}

