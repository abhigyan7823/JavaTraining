package section6;
import java.util.function.Predicate;
public class Pred3 {
    public static void main(String[] args) {
        Predicate<Integer> pre=i->i%2==0;
        System.out.println((pre.test(10))?true:false);
        System.out.println((pre.test(101))?true:false);
        System.out.println((pre.test(101))?true:false);
    }
}
