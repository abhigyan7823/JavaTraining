package section10;
import java.util.ArrayList;
import java.util.function.*;
class Student{
    String name;
    int id;
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
public class Bifun2 {
    public static void main(String[] args) {
        ArrayList<Student> al=new ArrayList<Student>();
        BiFunction<String,Integer,Student> bif=(name,id)->new Student(name,id);
        al.add(bif.apply("ab",1));
        al.add(bif.apply("abs",41));
        al.add(bif.apply("asb",21));
        al.add(bif.apply("asbee",12));
        al.add(bif.apply("asba",11));
        al.add(bif.apply("abde",2));
        for(Student s:al){
            System.out.println(s.name+" "+s.id);
        }
    }
}
