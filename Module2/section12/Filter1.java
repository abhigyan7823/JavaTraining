package section12;
import java.util.*;
import java.util.stream.*;
public class Filter1 {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<=5;i++){
            al.add(i);
        }
        System.out.println(al);
        List<Integer> l1=al.stream().map(i->i+i).collect(Collectors.toList());
        System.out.println(l1);
        al.addAll(l1);
        Collections.sort(al);
        System.out.println(al);
        Set<Integer> s=al.stream().map(i->i+1).collect(Collectors.toSet());
        System.out.println(s);
    }
}
