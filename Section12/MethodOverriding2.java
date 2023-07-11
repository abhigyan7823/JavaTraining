
package OOPS;
class A{
    public void print(){
        System.out.println("A");
    }
    public void print2(){
        System.out.println("print 2");
    }
}
class B extends A{
    @Override
    public void print(){
           System.out.println("B");
    }
    public void print3(){
        System.out.println("print3");
    }
}
public class MethodOverriding2 {
    public static void main(String[] args) {
        A a=new B();
        a.print();
        a.print2();
        //a.print3();
    }
}
