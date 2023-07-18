package Section23;
import java.io.*;
class Student3{
    int roll;
    String name;
}
public class Serialization5 {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos=new FileOutputStream("/home/abhigyan_bhadoriya/prc/Student3.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        Student3 s3=new Student3();
        s3.roll=11;
        s3.name="abhi";
        oos.writeObject(s3);
        fos.close();
        oos.close();
    }
}
