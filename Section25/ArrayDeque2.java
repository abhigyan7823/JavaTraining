package Section25;
import java.util.Iterator;
import java.util.Deque;
import java.util.ArrayDeque;
public class ArrayDeque2 {
    public static void main(String[] args) {
        Deque<Integer> de=new ArrayDeque<>();
        de.offer(0);
        de.offer(1);
        de.offer(2);
        de.offer(3);
        Iterator it=de.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println(de.size());
        /*for(int i=0;i<de.size();i++){
            System.out.println(de.peek());
        }*/
        System.out.println(de.peek());
        de.poll();
        System.out.println(de);
        de.add(4);
        System.out.println(de);
        System.out.println(de.poll());
        
    }
}
