package Section23;
import java.io.*;
public class RandomAccess {
    public static void main(String[] args) throws Exception{
        RandomAccessFile ra=new RandomAccessFile("/home/abhigyan_bhadoriya/prc/demo2.txt","rw");
        //ra.skipBytes(2);//Blac1 Bulls led by Captin Yami
        System.out.print((char)ra.read());
        System.out.print((char)ra.read());
        System.out.print((char)ra.read());
        System.out.print((char)ra.read());
        ra.write('1');
        System.out.print((char)ra.read());
        ra.skipBytes(2);
        System.out.print((char)ra.read());
        System.out.println();
        ra.seek(5);
        System.out.print((char)ra.read());
        System.out.println(ra.getFilePointer());
        
    }
}
