package Section25;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
public class HashMap2 {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>(Map.of("A",1,"B",2,"C",3,"D",4));
        Iterator it=hm.keySet().iterator();
        while(it.hasNext()){
            String key=(String)it.next();
            System.out.print(key+"->"+hm.get(key)+",");
        }
        System.out.println("");
        for(String st:hm.keySet()){
            System.out.print(st+" ");
        }
        System.out.println("");
        for(Integer i:hm.values()){
            System.out.print(i+" ");
        }
        System.out.println("");
        for(Map.Entry<String,Integer> en:hm.entrySet()){
            System.out.print(en.getKey()+"->"+en.getValue()+", ");
        }
        System.out.println("");
        for(String st:hm.keySet()){
            System.out.print(hm.get(st)+" ");
        }
        System.out.println("");
        
    }
}
