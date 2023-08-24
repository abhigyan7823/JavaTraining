package section6;
import java.util.function.Predicate;
public class Pred4 {
    public static void main(String[] args) {
        String[] name={"Harry","Ron","Tom","Hermione"};
        Predicate<String> pre=s->s.charAt(0)=='H';
        for(String s:name){
            if(pre.test(s)){
                System.out.println(s);
            }
        }
    }
}
