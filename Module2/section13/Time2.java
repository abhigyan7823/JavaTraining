package section13;
import java.time.*;
public class Time2 {
    public static void main(String[] args) {
        //LocalDateTime ld=LocalDateTime.of(2001, Month.AUGUST, 02);
        LocalDateTime ld=LocalDateTime.of(2001, Month.AUGUST, 02, 05, 40);
        System.out.println(ld);
        System.out.println(ld.plusDays(90));
        System.out.println(ld.minusDays(90));
        System.out.println(ld.plusMonths(1000));
        System.out.println(ld.plusYears(22));
        
    }
}