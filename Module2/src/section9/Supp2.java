package section9;
import java.util.function.Supplier;
public class Supp2 {
    public static void main(String[] args) {
        Supplier<String> s=()->{
            String[] str={"Luffy","Zoro","Navi","Ussop","Sanji","Chopper","Robin"};
            int x=(int)(Math.random()*7);
            return str[x];
        };
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
    }
}
