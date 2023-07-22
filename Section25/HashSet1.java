package Section25;
import java.util.Iterator;
import java.util.HashSet;
public class HashSet1 {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();
        int[] arr={1,1,2,4,2,3,5,7,8,2,11,13,10,12,15};
        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }
        System.out.println(hs);
        Iterator it=hs.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println("");
        for(int i:hs){
            System.out.print(i+" ");
        }
        HashSet<Integer> hs1=new HashSet<>();
        System.out.println("");
        System.out.println(hs.size());
        System.out.println(hs.hashCode());
        hs.remove(10);
        System.out.println(hs);
    }
}
