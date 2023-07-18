package Section23;
import java.io.*;
class Student{
    int roll_no;
    String name;   
}
public class Serialization1 {
    public static void main(String[] args) throws Exception{
        FileInputStream fin=new FileInputStream("/home/abhigyan_bhadoriya/prc/Student1.txt");
        //PrintStream()
       BufferedReader br=new BufferedReader(new InputStreamReader(fin));
        Student s1=new Student();
        s1.roll_no=Integer.parseInt(br.readLine());
        s1.name=br.readLine();
        System.out.println(s1.roll_no+" "+s1.name);
    }
}
