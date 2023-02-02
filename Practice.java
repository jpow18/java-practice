
/**
 * Practice in Java, inspired by course on FCC
 *
 * @author James Pow
 */
import java.util.Scanner;
public class Practice
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("What is your name? ");
        String name = scanner.nextLine();
        
        System.out.printf("Hello %s. How old are you? ", name);
        int age = scanner.nextInt();
        
        // clean up input buffer
        scanner.nextLine();
        System.out.printf("%d is an age. What's a programming language? ", age);
        int num = scanner.nextInt();
        
        System.out.printf("%d is a number, stupid.", num); 
        
        scanner.close();
    }

}
