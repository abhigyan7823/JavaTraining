/*Generic Class*/
package Section24;
class My <T>{
    T obj;
    public T get() {
        return obj;
    }
    public void add(T obj) {
        this.obj = obj;
    }
}
public class Generics2 {
    public static void main(String[] args) {
        My<Integer> m1=new My<>();
        m1.add(1);
        System.out.println(m1.get());
        My<String> m2=new My<>();
        m2.add("harry");
        System.out.println(m2.get());
    }
}
