package Section23;
import java.io.FileInputStream;
/**
 *
 * @author abhigyan_bhadoriya
 */
public class FileIn1 {
    public static void main(String[] args) {
        try{
            try(FileInputStream fin=new FileInputStream("/home/abhigyan_bhadoriya/prc/demo2.txt")){
                byte[] b=new byte[fin.available()];
                fin.read(b);
                String str=new String(b);
                System.out.println(str);
            }
        }catch(Exception e){}
    }
}
