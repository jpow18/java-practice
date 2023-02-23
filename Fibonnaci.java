import java.util.Scanner;
public class Fibonnaci
{
    public static int fibonnaci(int n) {
        if (n < 1) {
            System.out.println("Please enter a positive integer!");
            return -1;
        }
        
        int num = 1;
        while (true) {
            if (num >= n) {
                break;
            }
            num += num;
        }
        return num;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a positive integer: ");
        int number = input.nextInt();
        
        System.out.printf("The %dth Fibonnaci number is: %d", number,
        fibonnaci(number));
    }
}
