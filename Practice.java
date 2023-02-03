
/**
 * Practice in Java, inspired by course on FCC
 *
 * @author James Pow
 */
import java.util.Scanner;
import java.util.Arrays;
public class Practice
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numbers[] = new int[5];    
        int numbers2[] = new int[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Please enter an integer for array1: ");
            numbers[i] = scanner.nextInt();
            // Clean up buffer by removing leftover newline
            scanner.nextLine();
            System.out.print("Please enter an integer for array2: ");
            numbers2[i] = scanner.nextInt();
            // Clean up buffer by removing leftover newline
            scanner.nextLine();
        }
        // Arrays.equals compares the conents of two arrays
        if (Arrays.equals(numbers, numbers2)) {
            System.out.println("The two arrays have identical contents");
        } else if (numbers == numbers2) {
            System.out.println("The two arrays have identical memory addresses");
        } else {
            System.out.println("The two arrays are not identical" +
            " in any way.");
       }
    }

}
