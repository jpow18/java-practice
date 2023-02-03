
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
        
        char vowels[] = {'a', 'z', 'a', 'v', '1', 'a', 'f', '4', 'b', '-','5'};
        System.out.println((Arrays.toString(vowels)));

        Arrays.sort(vowels);
        int foundItemIndex = Arrays.binarySearch(vowels, '5');
        
        System.out.println((Arrays.toString(vowels)));
        System.out.println(foundItemIndex);
        scanner.close();
    }

}
