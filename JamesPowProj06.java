
/**
 * Two overloaded methods to count letters in a string
 *
 * @author James Pow
 */
import java.util.Scanner;
public class JamesPowProj06
{
    public static void main(String[] args) {
        char repeat = 'n';
        do {
            // Format any rounds after the first
            if (repeat == 'y') {
                System.out.print("\n\n");
            }
            
            Scanner input = new Scanner(System.in);
        
            System.out.print("Enter a string: ");
            String str = input.nextLine();
            System.out.print("Enter a char: ");
            String temp = input.nextLine();
            char c = temp.charAt(0);
            System.out.println();
            
            System.out.printf("The result of calling function int " +
              "countLetters(String s) is: %d\n", countLetters(str));
            
            System.out.printf("The result of calling function int " +
              "countLetters(String s, char c) is: %d\n\n", countLetters(str, c));
              
            System.out.print("Do you want to do another test? Y/N ");
            temp = input.nextLine();
            repeat = temp.charAt(0);
            
        } while (repeat == 'y');
        
        System.out.println("Thanks for playing!");
    }    
    
    public static int countLetters(String s) {
        int count = 0;
        // loop through string
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || 
                (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) {
                count++;
            }
        }
        return count;
    } 
    public static int countLetters(String s, char c) {
        // c is not an english letter
        if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))) {
            return -1;
        }
        
        char lowerCase = Character.toLowerCase(c);
        int count = 0;
        // Count occurences of c in s
        for (int i = 0; i < s.length(); i++) {
            if (Character.toLowerCase(s.charAt(i)) == c) {
                count++;
            }
        }
        return count;
    }
}
