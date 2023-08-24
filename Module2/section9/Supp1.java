package section9;

import java.util.function.Supplier;
public class Supp1 {
    public static void main(String[] args) {
        Supplier<Double> sup=()->Math.random();
        System.out.println(sup.get());
    }
}
