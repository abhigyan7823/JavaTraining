package section10;
import java.util.function.BiPredicate;
public class Bipre1 {
    public static void main(String[] args) {
        BiPredicate<Integer,Integer> bipre=(a,b)->(a+b)%2==0 ? true:false;
        System.out.println(bipre.test(Integer.SIZE, Integer.SIZE));
        System.out.println(bipre.test(1, 2));
        System.out.println(bipre.test(4, 2));
        
    }
}
