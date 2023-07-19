package Section24;
import java.util.*;
public class Generics1 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();  
        list.add("ab");  
        list.add("sa");  
        String s=list.get(1);//type casting is not required  
        System.out.println(s);  
    }
}
