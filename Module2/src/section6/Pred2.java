package section6;
import java.util.function.Predicate;
public class Pred2 {
    public static void main(String[] args) {
        Predicate<Integer> gre=i->(i>10);
        Predicate<Integer> low=i->(i<20);
        System.out.println(gre.and(low).test(15));
        System.out.println(gre.and(low).negate().test(15));
        System.out.println(gre.and(low).test(25));
        System.out.println(gre.and(low).negate().test(25));
    }
}
