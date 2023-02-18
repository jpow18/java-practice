
/**
 * This project converts a binary string to its decimal equivalent
 *
 * @author James Pow
 */
import java.util.Scanner;
public class JamesPowProj4
{
    public static void main(String[] args) {
        // Using the built-in method
        String binaryString = "101011011";
        int convertedBinaryString = Integer.parseInt(binaryString, 2);
        System.out.println(convertedBinaryString);
        
        // With my own code
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String userBinaryString = scanner.nextLine();
        int decimal = 0;
        int power = 0;
        for (int i = userBinaryString.length() - 1; i >= 0; i--) {
            if (userBinaryString.charAt(i) == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }
        System.out.println("Decimal equivalent: " + decimal);
        
    }
}
