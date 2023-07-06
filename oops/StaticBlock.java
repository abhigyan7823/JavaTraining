package oops;
public class StaticBlock {
    static int a=1;
    static int b;
    static{
        System.out.println("Static");
        b=a * 4;
    }
    public static void main(String[] args) {
        System.out.println("main");
        System.out.println("a "+a);
        System.out.println("b "+b);
    }  
}
