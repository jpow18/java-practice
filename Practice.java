
/**
 * Practice in Java, inspired by course on FCC
 *
 * @author James Pow
 */
import java.util.ArrayList;
import java.util.Comparator;
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
        
        //numbers.clear(); // Clear the entire list
        
        numbers.set(2, Integer.valueOf(99)); // place value 99 at index 2
        
        numbers.sort(Comparator.naturalOrder()); // Sort by ascending value
        //numbers.sort(Comparator.reverseOrder()); // Sort in reverse
        
        int arrayListLength = numbers.size(); // Obvious
        
        // Returns true if the value is there
        //System.out.println(numbers.contains(Integer.valueOf(969))); 
        //System.out.println(numbers.isEmpty()); // Checks if array is empty
        
        numbers.forEach(number -> {
            numbers.set(numbers.indexOf(number), number * 2);
        });
        
        System.out.println(numbers);
    }

}
