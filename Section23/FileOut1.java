package Section22;
import java.io.FileOutputStream;
import java.io.OutputStream;
public class FileOut1 {
    public static void main(String[] args) {
        try{
            FileOutputStream fo=new FileOutputStream("/home/abhigyan_bhadoriya/prc/demo.txt");
            String st="You must take your opponent into a deep dark forest where 2+2=5, and the path leading out is only wide enough for one.";
            //byte b[]=st.getBytes();
            fo.write(st.getBytes());
            //fo.write(210);
            fo.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
