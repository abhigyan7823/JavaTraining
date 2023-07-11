packagE OOPS;
interface B1{
    void a1();
    default void a3(){
        System.out.println("a3");
    }
}
interface B2 extends B1{
    void a2();
}
class B implements B2{
    @Override
    public void a1(){
        System.out.println("A1");
    }
    @Override
    public void a2(){
        System.out.println("A2");
    }
    //public void a3(){}
}
public class Interface1 {
    public static void main(String[] args) {
        B b=new B();
        //b.a1();
        //B2 s =b;
        b.a2();
        b.a3();
        B1 b1=new B();
        b1.a1();
       // B1 b2=new B1();
       //B1 bb[]=new B1[];
    }  
}
