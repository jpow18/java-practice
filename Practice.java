
/**
 * Practice in Java, inspired by course on FCC
 *
 * @author James Pow
 */
import java.time.LocalDate;
public class Practice
{
    public static void main(String[] args) {
        User youngerUser = new User();
        
        youngerUser.name = "James Pow";
        youngerUser.birthday = LocalDate.parse("1995-01-31");
        
        System.out.printf("%s was born back in %s and he is now %d years old.",
        youngerUser.name, youngerUser.birthday, youngerUser.age());
    }

}
