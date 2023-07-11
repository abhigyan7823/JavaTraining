package OOPS;
class Outer{
   void outerMethod() {
      System.out.println("Outer Method");
      
      class Inner {
         void innerMethod() {
            System.out.println("Inner Method");
         }
      }
      
      Inner y = new Inner();
      y.innerMethod();
   }
}
public class InnerClass2 {
    public static void main(String[] args) {
      Outer x=new Outer();
      x.outerMethod();
   }    
}
