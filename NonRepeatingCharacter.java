import java.util.HashMap;
import java.util.Map;
public class NonRepeatingCharacter
{
    public static void main(String[] args) {
        System.out.println(findNonRepeatingCharacter("heelloo"));
    }
    
    public static char findNonRepeatingCharacter(String s) {
        s = s.replaceAll("[^a-zA-Z]", "").toLowerCase();
        
        HashMap<Character, Integer> charCount = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            if (!charCount.containsKey(s.charAt(i))) {
                charCount.put(s.charAt(i), 1);
            } else {
                int value = charCount.get(s.charAt(i));
                charCount.put(s.charAt(i), value + 1);
            }
        }
        
        // Loop through charCount, if any key has a value of 1, print
        // the key
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            char key = entry.getKey();
            int value = entry.getValue();
            if (value == 1) {
                return key;
            }
        }
        return '\0';
    }
}
