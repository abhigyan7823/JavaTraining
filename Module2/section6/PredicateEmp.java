package section6;
import java.util.*;
import java.util.function.Predicate;
class Student{
    String name;
    String role;
    public Student(String name, String role) {
        this.name = name;
        this.role = role;
    }
   public String getName(){
       return name;
   }
   public String getRole(){
       return role;
   }
   public String toString(){
       return name+":"+role;
   }
}
public class PredicateEmp {
    public static void main(String[] args) {
        List<Student> al=new ArrayList<Student>();
        al.add(new Student("Luffy","Captin"));
        al.add(new Student("Zoro","Swords Man"));
        al.add(new Student("Nami","Navigator"));
        al.add(new Student("Ussop","Cook"));
        al.add(new Student("Sanji","Cook"));
        List cook = process(al, (var u) -> u.getRole().equals("Cook"));
        System.out.println(cook);
        List captin = process(al, (var u) -> u.getRole().equals("Captin"));
        System.out.println(captin);
    }
    public static List<Student> process(List<Student> al,Predicate<Student> pre){
        List<Student> result = new ArrayList<Student>();
        for (Student st: al){        
            if (pre.test(st)){            
                result.add(st);
            }
        }    
        return result;
    }
}
