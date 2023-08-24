package section13;
import java.time.*;
public class DateTime1 {
    public static void main(String[] args) {
        LocalDate ld=LocalDate.now();
        System.out.println(ld);
        
        LocalTime lt=LocalTime.now();
        System.out.println(lt);
        
        int day=ld.getDayOfMonth();
        int mm=ld.getMonthValue();
        int yy=ld.getDayOfYear();
        
        System.out.println(day);
        System.out.println(mm);
        System.out.println(yy);
        
        
    }
}
