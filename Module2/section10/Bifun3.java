package section10;
import java.util.*;
import java.util.function.*;
class Emp{
    int id;
    String name;
    double wages;
    public Emp(int id, String name, double wages) {
        this.id = id;
        this.name = name;
        this.wages = wages;
    }
}
class TimeSheet{
    int id;
    int days;
    public TimeSheet(int id, int days) {
        this.id = id;
        this.days = days;
    }
}
public class Bifun3 {
    public static void main(String[] args) {
        BiFunction<Emp,TimeSheet,Double> cal_wag=(e,t)-> e.wages*t.days;
        Emp e=new Emp(101,"abhi",30001);
        TimeSheet ts=new TimeSheet(101, 10);
        System.out.println(cal_wag.apply(e,ts));
    }
}
