package section7;
import java.util.*;
import java.util.function.Function;
class Student{
    String name;
    int mark;
    public Student(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }
}
public class fun2 {
    public static void main(String[] args) {
        ArrayList<Student> al=new ArrayList<>();
        al.add(new Student("A",11));
        al.add(new Student("P",80));
        al.add(new Student("L",63));
        al.add(new Student("E",54));
        al.add(new Student("D",45));
        al.add(new Student("C",36));
        al.add(new Student("B",87));
        Function<Student,String> fs=s->{
          int marks=s.mark;
          if(marks>80) return "A dist";
          else if(marks>=60) return"A";
          else if(marks>=50) return"B";
          else if(marks>=40) return"C";
          else if(marks>=33) return"D";
          else return "fail";
        };
        for(Student s:al){
            System.out.println(s.name+" "+s.mark+" "+fs.apply(s));
        }
    }
}
