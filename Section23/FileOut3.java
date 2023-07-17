package Section22;
import java.io.*;
public class FileOut3 {
    public static void main(String[] args) {
        try{
            FileOutputStream fo=new FileOutputStream("/home/abhigyan_bhadoriya/prc/demo2.txt");
            String str="Black Bulls led by Captin Yami";
            byte b[]=str.getBytes();
            for(byte x:b){
                fo.write(x);
            }
            fo.close();
        }
        catch(Exception e){}
    }
}
