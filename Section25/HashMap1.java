package Section25;
import java.util.Map;
import java.util.HashMap;
public class HashMap1 {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>(Map.of("A",1,"B",2,"C",3,"D",4));
        System.out.println(hm);
        hm.put("E",5);
        System.out.println(hm);
        System.out.println(hm.containsKey("E"));
        System.out.println(hm.remove("E"));
        System.out.println(hm);
        System.out.println(hm.containsValue(5));
        System.out.println(hm.get("A"));
        System.out.println(hm.size());
        System.out.println(hm.entrySet());
        
    }
}
