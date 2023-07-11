package OOPS;
class A{
    public void print(){
        System.out.println("A");
    }
    public void print1(){
        System.out.println("A2");
    }
}
class B extends A{
    @Override
    public void print(){
        System.out.println("B");
    }
    public void print2(){
        System.out.println("B2");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        A a=new A();
        a.print();
        B b=new B();
        b.print();
        A aa=new B();
        aa.print();
        //A aa1=new B();
        //aa.print2();  we cannot call method of sub class from ref. of super class.
        aa.print1();
    }
}
