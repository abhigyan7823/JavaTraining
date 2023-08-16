package section8;
import java.util.function.*;
import java.util.*;
class Emp{
    String name;
    int id;
    public Emp(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
public class Con3 {
    public static void main(String[] args) {
        ArrayList<Emp> al=new ArrayList<>();
        al.add(new Emp("A",2));
        al.add(new Emp("asd",5));
        al.add(new Emp("Aasd",4));
        al.add(new Emp("as",3));
        al.add(new Emp("e",1));
        Consumer<Emp> co=e->{
            System.out.println(e.id+" "+e.name);
        };
        
        for(Emp e:al){
            co.accept(e);
        }
    }
}
