package section3;
import java.util.*;
import java.util.Comparator;
import java.util.Collections;
public class Lambda1 {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int i=10;i<15;i++){
            al.add(i);
        }
        System.out.println(al);
        Collections.sort(al,(a,b)->(a>b)?-1:(a<b)?1:0);
        System.out.println(al);
    }
}
