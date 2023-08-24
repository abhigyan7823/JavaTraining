
package section7;
import java.util.function.Function;
public class fun1 {
    public static void main(String[] args) {
        Function<Integer,Double> half=(n)->n/2.0;
        System.out.println(half.apply(Integer.SIZE));
        System.out.println(half.apply(3));
        half=half.andThen(a->a*4);
        System.out.println(half.apply(3));
    }
}
