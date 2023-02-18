
public class StringDemo

{
   public static void main(String[] args) {
       String s = "HI                ";
       String s1 = "hi";
       // Find and print length
       System.out.println("The String is: " + s.length() + " chars long");
       
       // Find and print char at index 0
       try {
           System.out.println(s.charAt(2023));
       } catch (StringIndexOutOfBoundsException e) {
           System.out.println("An error occurred: " + e.getMessage());
       }
       
       // Trim whitespace from beginning and end of string
       System.out.println(s.trim());
       
       if (s.equals(s1)) {
           System.out.println("They are the same.");
       } else {
           System.out.println("They are not the same.");
       }
       
   }
}
