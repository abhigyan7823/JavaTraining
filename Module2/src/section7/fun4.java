package section7;
import java.util.Scanner;
import java.util.function.Function;
public class fun4 {
    public static void main(String[] args) {
        Function<String,String> f1=s->s.toLowerCase();
        Function<String,String> f2= s->s.substring(0,4);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter UName:");
        String username=sc.next();
        System.out.println("Enter Password:");
        String pwd=sc.next();
        if(f1.andThen(f2).apply(username).equals("abhi") && pwd.equals("java")){
            System.out.println("Valid User");
        }
        else{
            System.out.println("Invalid User");
        }
    }
}
