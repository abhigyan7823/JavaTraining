package Section25;
import java.util.*;
class MyCom implements Comparator<Integer> {
    public int compare(Integer o1,Integer o2){
        return o2-o1;
    }
}
public class PriorityQueue2 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(new MyCom());
        pq.add(20);
        pq.add(10);
        pq.add(30);
        pq.add(5);
        pq.add(15);
        pq.add(3);
        System.out.println(pq.peek());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.poll());
    }
}
