/*Generics Method*/
package Section24;
public class Generics3 {
    public<T> void print(T data){
        System.out.println(data);
    }
    public static void main(String[] args) {
        Generics3 g=new Generics3();
        g.print("hello");
        g.print(123);
    }
}
