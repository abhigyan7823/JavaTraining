package oops;
interface A1{
    public void print1();
}
public class Interface3 implements A1{
    @Override
    public void print1(){
        System.out.println("print1");
    }
    public static void main(String[] args) {
        A1 i=new A1() {
            @Override
            public void print1() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
        i.print1();      
        
    }
}
