package section5;
interface Left{
    default void print(){
        System.out.println("print1");
    }
}
interface Right{
    default void print(){
        System.out.println("print2");
    }
}
public class DefaultAnno3 implements Left,Right {
    public void print(){
        System.out.println("print main");
    }
    public static void main(String[] args) {
        Left l=new DefaultAnno3();
        l.print();
        
        
    }
}
