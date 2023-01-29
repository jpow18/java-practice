

public class ShowCurrentTime
{
    public static void main(String[] args) {
        // obtain the number of milliseconds from the beginning
        // of the UNIX epoch
        long totalMilliseconds = System.currentTimeMillis();
        
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = (int) (totalSeconds % 60);
        long totalMinutes = totalSeconds / 60;
        long currentMinute = (int) (totalMinutes % 60);
        long totalHours = totalMinutes / 60;
        long currentHour = (int) (totalHours % 24);
        
        // print current time in HH:MM:SS format
        System.out.printf("Current time is: %d:%d:%d GMT", currentHour, currentMinute, currentSecond);
    }
}
