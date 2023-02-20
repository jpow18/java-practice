
public class FindMinMax
{
    public static void main(String[] args) {
        int[] numbers = {5,3,8,2,0,1};
        findMinMax(numbers);
    }
    
    public static void findMinMax(int[] arr) {
        int min = 0, max = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        
        System.out.printf("Max: %d, Min: %d\n", max, min);
    }
}
