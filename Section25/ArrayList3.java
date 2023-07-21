package Section25;
import java.util.ArrayList;

public class ArrayList3 {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(0,2);
        al.add(3);
        al.add(0,1);
        System.out.println(al);
        al.set(0,0);
        System.out.println(al);
        
    }
}
