package section12;
import java.util.*;
import java.util.stream.*;
public class Stream2 {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<5;i++){
            int tamp=(int)(Math.random()*15)+1;
            al.add(tamp);
        }
        System.out.println(al);
        int mi=al.stream().min((a,b) -> a.compareTo(b)).get();
        System.out.println(mi);
        int ma=al.stream().min((a,b) -> -a.compareTo(b)).get();
        System.out.println(ma);
        al.stream().forEach(tamp->System.out.print(tamp+"  "));
        
    }
}
