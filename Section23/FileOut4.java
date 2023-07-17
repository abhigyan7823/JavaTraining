package Section22;
import java.io.*;
public class FileOut4 { 
    public static void main(String[] args) {
        try{
            FileOutputStream fo=new FileOutputStream("/home/abhigyan_bhadoriya/prc/demo3.txt");
            String str="Black Bulls led by Captin Yami";
            byte b[]=str.getBytes();
            
            fo.write(b,2, str.length()-3);
            fo.close();
        }
        catch(Exception e){}
    }
    
}
