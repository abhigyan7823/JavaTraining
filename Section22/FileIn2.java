package Section22;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class FileIn2 {
    public static void main(String[] args) {
        try{
            try{
                FileInputStream fin=new FileInputStream("/home/abhigyan_bhadoriya/prc/demo2.txt");
                FileOutputStream fout=new FileOutputStream("/home/abhigyan_bhadoriya/prc/demo3.txt");
                int a;
                while((a=fin.read())!=-1){
                    fout.write(a);
                }
            }catch(Exception e){}
        }catch(Exception e){}
        try{
            try(FileInputStream fin3=new FileInputStream("/home/abhigyan_bhadoriya/prc/demo3.txt")){
                byte[] b=new byte[fin3.available()];
                fin3.read(b);
                String str=new String(b);
                System.out.print(str);
            }
        }catch(Exception e){}
    }
}
