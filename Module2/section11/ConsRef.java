package section11;
interface In{
    public Demo get();
}
class Demo{
    Demo(){
        System.out.println("Demo");
    }
}
public class ConsRef {
    public static void main(String[] args) {
        In i1=Demo::new;
        i1.get();
    }
}
