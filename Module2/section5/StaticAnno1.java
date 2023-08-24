package section5;
interface Anno1{
    public static void print(){
        System.out.println("print");
    }
}
public class StaticAnno1 {
    public static void main(String[] args) {
        Anno1.print();
    }
}
