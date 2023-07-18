package Section23;
import java.io.*;
class Student2{
    int roll;
    String name;
}
public class Serialization3 {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos=new FileOutputStream("/home/abhigyan_bhadoriya/prc/Student2.txt");
        DataOutputStream dos=new DataOutputStream(fos);
        Student2 s2=new Student2();
        s2.roll=12;
        s2.name="abhi";
        dos.writeInt(s2.roll);
        dos.writeUTF(s2.name);
    }
}
