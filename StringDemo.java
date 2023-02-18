
public class StringDemo

{
   public static void main(String[] args) {
       String s = "HI";
       
       // Find and print length
       System.out.println("The String is: " + s.length() + " chars long");
       
       // Find and print char at index 0
       try {
           System.out.println(s.charAt(2023));
       } catch (StringIndexOutOfBoundsException e) {
           System.out.println("An error occurred: " + e.getMessage());
       }
       
       
       
   }
}
