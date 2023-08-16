package section8;
import java.util.*;
import java.util.function.*;
public class Con2{
    public static void main(String[] args) {
        Consumer<List<Integer> > modify = list ->{
            for (int i = 0; i < list.size(); i++)
                list.set(i, 2 * list.get(i));
        };
        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(1);
        list.add(3);
        System.out.println(list);
        modify.accept(list);
        System.out.println(list);
    }
}