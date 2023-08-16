package section8;
import java.util.function.*;

public class Con1 {
    public static void main(String[] args) {
        Consumer<Integer> co=s->System.out.println(s);
        co.accept(5);
        co.accept(10);
        Consumer<String> co1=s->System.out.println(s);
        co1.accept("asdf");
        co1.accept("1651");
    }
}
