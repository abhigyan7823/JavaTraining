package section11;
interface In1{
    public void m1();
}
public class DoubleCol2 {
    static void m2(){
        System.out.println("m1");
    }
    public static void main(String[] args) {
        In1 i1=DoubleCol2::m2;
        i1.m1();
    }
}
