package Section25;
import java.util.*;
public class TreeMap1 {
    public static void main(String[] args) {
        TreeMap<String,Integer> tm=new TreeMap<>();
        tm.put("Tom",1);
        tm.put("Ron",2);
        tm.put("Harry", 3);
        System.out.println(tm);
        Iterator it=tm.keySet().iterator();
        while(it.hasNext()){
            String key=(String)it.next();
            System.out.print(key+"->"+tm.get(key)+" ");
        }
        System.out.println("");
        for(Map.Entry<String,Integer> en:tm.entrySet()){
            System.out.print(en.getKey()+"->"+en.getValue()+" ");
        }
    }
}
