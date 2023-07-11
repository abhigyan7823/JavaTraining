
package Exception_Handling;
import java.io.*;
public class ExceptionHandling6 {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("/home/abhigyan_bhadoriya/prc/demo.txt");
             BufferedReader br = new BufferedReader(
                 new FileReader("abtextfile.txt"))) {
            String text;
            while ((text = br.readLine()) != null) {
                byte arr[] = text.getBytes();
                fos.write(arr);
            }
            System.out.println( "File content copied to another one.");
        }
        catch (Exception e) {
           System.out.println(e);
        }
        System.out.println("Closed");
    }
}
