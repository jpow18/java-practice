
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
        
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        
        System.out.println(name);
        
        scanner.close();
    }

}
