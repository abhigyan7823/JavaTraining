package section6;
import java.util.ArrayList;
import java.util.function.Predicate;
public class Pred5 {
    public static void main(String[] args) {
        String[] name={"Harry","Ron","Tom","Hermione","",null};
        Predicate<String> pre=(s)->s!=null && s.length()!=0;
        ArrayList<String> al=new ArrayList<>();
        for(String s:name){
            if(pre.test(s)){
                al.add(s);
            }
        }
        System.out.println(al);
    }
}
