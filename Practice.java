
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
        
        System.out.println(examScores.toString());
    }

}
