
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
        int numbers[] = {1,4,5,6,7,8,10, 1235,1235,2436,82345,};
        
        int copyOfNumbers[] = Arrays.copyOf(numbers, 7);
        
        Arrays.fill(numbers, 19);
        
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(copyOfNumbers));
    }

}
