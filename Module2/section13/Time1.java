package section13;
import java.time.*;
public class Time1 {
    public static void main(String[] args) {
        LocalTime time=LocalTime.now();
        System.out.println(time);
        int h=time.getHour();
        int m=time.getMinute();
        int s=time.getSecond();
        int n=time.getNano();
        
        System.out.println(h);
        System.out.println(m);
        System.out.println(s);
        System.out.println(n);
        
    }
}
