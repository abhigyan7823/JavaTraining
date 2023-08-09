package section5;
interface Anno1{
    default void print(){
        System.out.println("print");
    }
}
public class DefaultAnno2 implements Anno1{
    @Override
    public void print(){
        System.out.println("print1");
    }
    public static void main(String[] args) {
        Anno1 a=new DefaultAnno1();
        a.print();
        DefaultAnno2 a1=new DefaultAnno2();
        a1.print();
    }
}
