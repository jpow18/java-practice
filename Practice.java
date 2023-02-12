
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
        
        
        examScores.forEach((subject, score) -> {
            examScores.replace(subject, score - 10);
            //System.out.println(subject + " - " + score);
        });
        //examScores.putIfAbsent("Math", 70);
        
        //examScores.replace("Math", 2); // Replace value associated with key
        
        //examScores.remove("History"); // Clears key/value
        System.out.println(examScores);
        //examScores.clear(); // Clears contents
        
        //System.out.println(examScores.containsKey("Math")); // returns bool
        //System.out.println(examScores.containsValue(Integer.valueOf(52))); // returns bool

        //System.out.println(examScores.size());
        //System.out.println(examScores.isEmpty());
        //System.out.println("Your Physics score is: " + 
        //examScores.getOrDefault("Physics", -1));
    }

}
