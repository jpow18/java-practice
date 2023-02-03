
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
        
        char vowels[] = {'a', '3', 'a', 'v'};
        Arrays.sort(vowels);
        System.out.println((Arrays.toString(vowels)));
        scanner.close();
    }

}
