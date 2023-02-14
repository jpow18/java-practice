
/**
 * Practice in Java, inspired by course on FCC
 *
 * @author James Pow
 */
import java.time.LocalDate;
public class Practice
{
    public static void main(String[] args) {
        Book hp = new Book("Harry Potter", "Jk Rowling", 327);
        AudioBook drac = new AudioBook("Dracula", "Bram Stoker", 30000);
        Ebook jeeves = new Ebook("Carry on Jeeves", "P.G. Wodehouse", 288, "PDF");
        System.out.print(jeeves.toString());
    }

}
