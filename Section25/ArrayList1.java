package Section25;
import java.util.Iterator;
import java.util.ArrayList;
public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<Integer>();
        al1.add(1);
        al1.add(2);
        al1.add(3);
        System.out.println(al1);
        System.out.println("size-> "+al1.size());
        Iterator it=al1.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println("");
        al1.remove(2);
        al1.add(4);
        al1.add(5);
        System.out.println(al1);
        for(int i=0;i<al1.size();i++){
            System.out.print(al1.get(i)+" ");
        }
        System.out.println(" ");
        for(Integer i:al1){
            System.out.print(i+" ");
        }
        
    }
}
