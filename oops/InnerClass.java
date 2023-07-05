package oops;
class Outer{
    public void printOuter(){
        System.out.println("Outer");
    }
    Inner in = new Inner();
    
    class Inner{
        //in.printInner();
        public void printInner(){
            System.out.println("Inner");
        }
        
    }
}
public class InnerClass {
    public static void main(String[] args) {
        Outer o=new Outer();
        Outer.Inner oi=new Outer().new Inner();//to access inner class we first need to create object of outer class then object of inner class
        o.printOuter();
        oi.printInner();
    }
}
