package section12;
import java.util.*;
import java.util.stream.*;
class Emp{
    String name;
    int sal;
    int id;
    public Emp(String name, int sal,int id) {
        this.name = name;
        this.sal = sal;
        this.id=id;
    }
    public String toString(){
        return name+"-"+sal+" "+id;
    }
    
}
public class Stream3 {
    public static void main(String[] args) {
        ArrayList<Emp> al=new ArrayList<>();
        al.add(new Emp("Luffy",100000,1));
        al.add(new Emp("Zoro",90000,2));
        al.add(new Emp("Ussop",5000,3));
        al.add(new Emp("Nami",90000,4));
        al.add(new Emp("Sanji",70000,5));
        al.add(new Emp("Chopper",20000,6));
        List<Emp> l1=al.stream().filter(e-> e.sal>75000).collect(Collectors.toList());
        //List<String> l1 = al.stream().filter(s -> s.length() <= 4).collect(Collectors.toList());
        System.out.println(l1);
        List<Integer> l2=al.stream().filter(e->e.sal<=5000).map(e->e.sal+5000).collect(Collectors.toList());
        //List<Integer> l3=l2.stream().map(e->e.sal+5000).collect(Collectors.toList());
        System.out.println(l2);
        
        /*List<Emp> l3= al.stream().sorted((i1, i2) -> {
            (i1.sal).
        });
        /*
        List<Emp> l3= al.stream().sorted((a,b) -> {
        
            if(a.sal == b.sal){
                if(a.id!=b.id){
                    a.
                }
            }
        });
        */
    }
}
