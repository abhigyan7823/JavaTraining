package Section25;
import java.util.LinkedHashSet;
public class LinkedHashSet1 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> ls=new LinkedHashSet<>();
        int count=10;
        for(int i=0;i<5;i++){
            ls.add(count--);
        }
        System.out.println(ls);
        
    }
}
