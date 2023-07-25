package Section25;
import java.util.*;
public class PropertiesClass2 {
    public static void main(String[] args) {
        Properties p1=System.getProperties();  
        Set set=p1.entrySet();  
        Iterator itr=set.iterator();  
        while(itr.hasNext()){  
            Map.Entry entry=(Map.Entry)itr.next();  
            System.out.println(entry.getKey()+" = "+entry.getValue()); 
        }
    }
}
