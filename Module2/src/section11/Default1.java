package section11;
class Demo1{
    void show(){
        System.out.println("hello");
    }
}
public class Default1 {
    public static void main(String[] args) {
        Demo1 d=new Demo1();
        d.show(); // calling a default method of Demo Class
    }
}
