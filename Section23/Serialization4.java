package Section23;
import java.io.*;
class Student2{
    int roll;
    String name;
}
public class Serialization4 {
    public static void main(String[] args) throws Exception{
        FileInputStream fin=new FileInputStream("/home/abhigyan_bhadoriya/prc/Student2.txt");
        DataInputStream dis=new DataInputStream(fin);
        Student2 s2=new Student2();
        s2.roll=dis.readInt();
        s2.name=dis.readUTF();
        System.out.println(s2.roll+" "+s2.name);
    }
}
