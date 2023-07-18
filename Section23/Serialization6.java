package Section23;
import java.io.*;
class Student3{
    int roll;
    String name;
}
public class Serialization6 {
    public static void main(String[] args) throws Exception{
        FileInputStream fin=new FileInputStream("/home/abhigyan_bhadoriya/prc/Student3.txt");
        ObjectInputStream oin=new ObjectInputStream(fin);
        Student3 s3=new Student3();
        //s3=(Student3)oin.readObject();
        /*s3.roll=oin.readInt();
        s3.name=oin.readUTF();*/
        System.out.println(s3.roll+" "+s3.name);
        fin.close();
        oin.close();
    }
}
