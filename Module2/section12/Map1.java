package section12;
import java.util.*;
import java.util.stream.*;
public class Map1 {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<=11;i++){
            al.add(i);
        }
        System.out.println(al);
        List<Integer> l1=al.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(l1);
    }
}
