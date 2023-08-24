package section6;
import java.util.function.Predicate;
public class Pred1 {
    public static void main(String[] args) {
        Predicate<Integer> pr= a->(a>18);
        System.out.println(pr.test(10));
        System.out.println(pr.test(20));
    }
}
