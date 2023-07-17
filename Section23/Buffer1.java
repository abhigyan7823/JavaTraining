package Section23;
import java.io.*;
public class Buffer1 {
    public static void main(String[] args) throws IOException{
        FileInputStream fin=new FileInputStream("/home/abhigyan_bhadoriya/prc/demo2.txt");
        BufferedInputStream bis=new BufferedInputStream(fin);
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        bis.mark(10);
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        bis.reset();
        System.out.println("");
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
    }
}
