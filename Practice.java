
/**
 * Practice in Java, inspired by course on FCC
 *
 * @author James Pow
 */
import java.time.LocalDate;
public class Practice
{
    public static void main(String[] args) {
        User user = new User("James Pow", "1995-01-31");
        
        Book book = new Book("Harry Potter", "Jk Rowling");
        
        user.borrow(book);
        
        System.out.printf("%s was born back in %s and he is now %d years old. \n",
        user.getName(), user.getBirthday(), user.age());
        
        System.out.printf("%s has borrowed these books: %s \n",
        user.getName(), user.books.toString());
    }

}
