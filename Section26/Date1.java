package Section26;
import java.util.*;
import java.time.*;
import java.time.temporal.*;
public class Date1 {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        System.out.println(System.currentTimeMillis()/1000);//sec
        System.out.println(System.currentTimeMillis()/1000/60/60);//hr
        System.out.println(System.currentTimeMillis()/1000/60/60/24);//days
        System.out.println(System.currentTimeMillis()/1000/60/60/24/365);//year
        Date d=new Date();
        System.out.println(d);
        System.out.println("Day "+d.getDay());
        System.out.println("Date "+d.getDate());
        System.out.println("Hours "+d.getHours());
        System.out.println("Min "+d.getMinutes());
        System.out.println("Sec "+d.getSeconds());
        System.out.println("Year "+d.getYear());
        System.out.println(d.getYear()+20);
        d.setDate(21);
        System.out.println(d.getDate());
        LocalDate d1=LocalDate.now(ZoneId.of("Asia/Kolkata"));
        System.out.println(d1);
        LocalDate d2=LocalDate.now();
        System.out.println(d2.getMonth());
        System.out.println(d2.ofEpochDay(1));
        d2.minusDays(10);
        System.out.println(d2);
        Period p=Period.of(10, 0, 0);
        System.out.println(p);
        System.out.println(p.addTo((LocalDate.now())));
        
    }
}
