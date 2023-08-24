package section8;
import java.util.ArrayList;
import java.util.function.*;
class Student{
    String name;
    int mark;
    public Student(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }
}
public class Con4 {
    public static void main(String[] args) {
        Predicate<Student> pre=s->s.mark>=60;
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
        Consumer<Student> con=s->{
            System.out.println(s.name+" "+s.mark);  
        };
        for(Student s:al){
            if(pre.test(s)){
                con.accept(s);
            }
        }
    }
}
