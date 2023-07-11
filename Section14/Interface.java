/*Multiple Inheritance*/
package OOPS;
interface A1{
    void print();
}
interface A2{
    void display();
}
class C implements A1,A2{
    public void print(){
        System.out.println("print C");
    }
    public void display(){
        System.out.println("display C");
    }
}

public class Interface {
    public static void main(String[] args) {
        //A1 a= new B();
        C c=new C();
        c.print();
        c.display();
        
    }
}
