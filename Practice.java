
/**
 * Practice in Java, inspired by course on FCC
 *
 * @author James Pow
 */
import java.util.ArrayList;

public class Practice
{
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        
        System.out.println(numbers.toString()); 
        System.out.println(numbers.get(2)); // get item by index
        
        numbers.add(100); // Add by value
        numbers.remove(2); // remove item by index
        System.out.println(numbers.toString());
        
        numbers.add(4);
        numbers.remove(Integer.valueOf(4)); // Remove first occurence of that value
        System.out.println(numbers);
        
        numbers.clear(); // Clear the entire list
    }

}
