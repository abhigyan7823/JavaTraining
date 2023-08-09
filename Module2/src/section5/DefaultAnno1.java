package section5;
interface Anno1{
    default void print(){
        System.out.println("print");
    }
}
public class DefaultAnno1  implements Anno1{
    public static void main(String[] args) {
        DefaultAnno1 d=new DefaultAnno1();
        d.print();
    }
}
