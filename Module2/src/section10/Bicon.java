package section10;
import java.util.function.*;
public class Bicon {
    public static void main(String[] args) {
        BiConsumer<Integer,String> bic=(a,b)-> System.out.println(a+" "+b);
        bic.accept(1,"a");
        bic.accept(6,"b");
        bic.accept(5,"c");
        
    }
}
