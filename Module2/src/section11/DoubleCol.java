package section11;
interface In1{
    public void m1();
}
public class DoubleCol {
    public void show(){
        System.out.println("m1");
    }
    public static void main(String[] args) {
        DoubleCol d=new DoubleCol();
        In1 i1=d :: show;
        i1.m1();
    }
}
