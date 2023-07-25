package Section25;
import java.util.StringTokenizer;
public class StringToknizer1 {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("Hello how are you"," ");  
        while (st.hasMoreTokens()) {  
            System.out.println(st.nextToken());  
        }
        StringTokenizer st1 = new StringTokenizer("Hello,how=are*you",",=* ");  
        while (st1.hasMoreTokens()) {  
            System.out.println(st1.nextToken());  
        }
        StringTokenizer st3 = new StringTokenizer("Hello,how=are*you",",=* ");
        System.out.println(st3.nextElement());
        System.out.println(st1.hasMoreElements());
        System.out.println(st3.hasMoreElements());
        System.out.println(st1.hasMoreTokens());
    }
}
