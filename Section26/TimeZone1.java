package Section26;

import java.util.GregorianCalendar;
import java.util.*;
public class TimeZone1 {
    public static void main(String[] args) {
        GregorianCalendar gc=new GregorianCalendar();
        System.out.println(gc);
        TimeZone tm=gc.getTimeZone();
        System.out.println(tm);
        System.out.println(tm.getID());
        System.out.println(tm.getDisplayName());
        System.out.println(tm.getDSTSavings());
        System.out.println(tm.observesDaylightTime());
        gc.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
        System.out.println(gc.getTimeZone());
        System.out.println(gc.getCalendarType());
    }
}
