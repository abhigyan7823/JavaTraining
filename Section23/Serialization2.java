package Section23;
import java.io.*;
class Student1{
    int roll_no;
    String name;   
}
public class Serialization2 {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos=new FileOutputStream("/home/abhigyan_bhadoriya/prc/Student1.txt");
        PrintStream ps=new PrintStream(fos);
        Student1 s1=new Student1();
        s1.roll_no=10;
        s1.name="abhi";
        ps.println(s1.roll_no);
        ps.println(s1.name);
    }
}
