package section7;
import java.util.*;
import java.util.function.Function;
class Emp{
    String name;
    double sal;
    public Emp(String name, double sal) {
        this.name = name;
        this.sal = sal;
    }
    public String toString(){
        return name+" "+sal;
    }
}
public class fun3 {
    public static void main(String[] args) {
        ArrayList<Emp> al=new ArrayList<>();
        al.add(new Emp("Bunny",20000));
        al.add(new Emp("Chinny",30000));
        al.add(new Emp("Pinny",4000));
        al.add(new Emp("Vinny",2000));
        System.out.println(al);
        Function<ArrayList<Emp>,Double> fs=al1->{
            double total=0;
            for(Emp e: al1){
                total=total+e.sal;
            }
            return total;  
        };
        System.out.println(fs.apply(al));
    }
}
