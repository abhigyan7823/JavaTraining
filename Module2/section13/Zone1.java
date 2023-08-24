package section13;
import java.time.*;

public class Zone1 {
    public static void main(String[] args) {
        ZoneId zd=ZoneId.systemDefault();
        System.out.println(zd);
        System.out.println(zd.getRules());
        System.out.println(zd.getId());
        System.out.println("");
        
        ZoneId la=ZoneId.of("America/Los_Angeles");
        System.out.println(la);
        System.out.println(la.getRules());
        System.out.println(la.getId());
        
    }
}
