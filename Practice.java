
/**
 * Practice in Java, inspired by course on FCC
 *
 * @author James Pow
 */
import java.util.HashMap;

public class Practice
{
    public static void main(String[] args) {
        HashMap<String, Integer> examScores = new HashMap<String, Integer>();
        examScores.put("Math", 75);
        examScores.put("English", 52);
        examScores.put("History", 51);
        
        //examScores.putIfAbsent("Math", 70);
        
        //examScores.replace("Math", 2); // Replace value associated with key
        
        System.out.println("Your Physics score is: " + 
        examScores.getOrDefault("Physics", -1));
    }

}
