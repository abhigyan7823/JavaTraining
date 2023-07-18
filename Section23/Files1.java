package Section23;
import java.io.*;
public class Files1 {
    public static void main(String[] args) throws Exception{
        File fi=new File("home/abhigyan_bhadoriya/prc");
        File[] li=fi.listFiles();
        /*for(File x:li){
            System.out.println(x.getName());
        }*/
        System.out.println(fi.getPath());
        //System.out.println(fi.getParent());
        //System.out.println(fi.getParentFile());
        System.out.println(fi.isDirectory());
        System.out.println(fi.canRead());
        System.out.println(fi.canWrite());
        System.out.println(fi.getName());
        fi.setReadable(true);
        System.out.println(fi.canRead());
        System.out.println(fi.canWrite());
        
    }
}
