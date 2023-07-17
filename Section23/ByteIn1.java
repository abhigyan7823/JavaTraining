package Section23;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ByteIn1 {
    public static void main(String[] args) {
        byte[] b={'f','c','d','q','w','e','r','t','y','u','i'};
        try (ByteArrayInputStream bis = new ByteArrayInputStream(b)) {
            String str=new String(bis.readAllBytes());
            System.out.println(str);
        }catch (IOException e){}
    }
}
