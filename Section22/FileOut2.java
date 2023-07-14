package Section22;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
public class FileOut2 {
    public static void main(String[] args) {
        try{
            FileOutputStream fo=new FileOutputStream("/home/abhigyan_bhadoriya/prc/demo2.txt");
            byte b[]={65,66,67,68,69,70};
            fo.write(b);
            fo.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
