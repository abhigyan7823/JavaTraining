package Section25;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer> al1=new ArrayList<>();
        for(int i=0;i<6;i++){
            al1.add(i,i*2);
        }
        System.out.println(al1);
        ArrayList<Integer> al2=new ArrayList<>();
        al2.addAll(al1);
        System.out.println(al2);
        al2.removeAll(al2);
        System.out.println(al2);
        al2.addAll(al1);
        al2.addAll(2,al1);
        System.out.println(al2);
        for(int i=0;i<7;i++){
            al2.remove(2);
        }
        System.out.println(al2);
        System.out.println(al2.contains(3));
        al2.addAll(2,al1);
        System.out.println(al2.containsAll(al1));
        al2.clear();
        System.out.println("Empty "+al2.isEmpty());
        al2.addAll(al1);
        al2.add(1,1);
        al2.addAll(al2);
        System.out.println(al2.indexOf(2));
        System.out.println(al2.lastIndexOf(2));
        al2.add(1);
        al2.add(2);
        System.out.println(al1);
        System.out.println(al2);
        Collections.sort(al2);
        System.out.println(al2);
        Collections.sort(al1,Collections.reverseOrder());
        al2.removeAll(al1);
        System.out.println(al2.isEmpty());
        ArrayList<Integer> al3= (ArrayList<Integer>)al1.clone();
        System.out.println(al3);
        
    }
}
