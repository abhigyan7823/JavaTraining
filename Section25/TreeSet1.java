package Section25;
import java.util.List;
import java.util.TreeSet;
import java.util.Iterator;
public class TreeSet1 {
    public static void main(String[] args) {
        TreeSet<Integer> ts=new TreeSet<>(List.of(10,1,54,9,2,1,45,8,7,52));
        System.out.println(ts);
        ts.add(51);
        System.out.println(ts.ceiling(48));
        System.out.println(ts.floor(48));
        TreeSet ts1=new TreeSet();
        ts1=(TreeSet)ts.clone();
        System.out.println(ts1);
        ts1.clear();
        System.out.println(ts1);
        System.out.println(ts.getClass());
        System.out.println(ts.headSet(5));//ele < 5
        System.out.println(ts.tailSet(5));//ele > 5
        System.out.println(ts.higher(100));
        System.out.println(ts.lower(0));
        System.out.println(ts.last());
        System.out.println(ts.pollFirst());
        System.out.println(ts.pollLast());
        System.out.println(ts);
        System.out.println(ts.subSet(5, 45));
        Iterator it=ts.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println("");
        for(Integer i:ts){
            System.out.print(i+" ");
        }
    }
}
