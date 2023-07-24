package Section25;
import java.util.*;
import java.util.LinkedList;
import java.util.Iterator;
public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        for(int i=0;i<=5;i++){
            ll.add(i);
        }
        System.out.println(ll);
        ll.add(0,1);
        System.out.println(ll);
        ll.remove(0);
        System.out.println(ll);
        ll.set(0,1);
        System.out.println(ll);
        ll.offer(7);
        System.out.println(ll);
        System.out.println(ll.peek());
        ll.poll();
        System.out.println(ll);
        ll.addLast(6);
        System.out.println(ll);
        ll.removeLast();
        System.out.println(ll);
        ll.add(ll.size()-1,6);
        System.out.println(ll);
        ll.clear();
        System.out.println(ll);
        //ll.remove(0);
        ll.pollFirst();
        System.out.println(ll);
        System.out.println(ll.peek());
        
    }
}
