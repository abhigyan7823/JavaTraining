package Section25;
import java.util.PriorityQueue;
public class PriorityQueue1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int j=5;
        for(int i=0;i<=4;i++){
            pq.add(j--);
        }
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq.peek());
        pq.add(0);
        System.out.println(pq.peek());    
    }
}
