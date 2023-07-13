package Section20;
import java.lang.reflect.*;
class My{
    int a;
    private int b;
    public int getB() {
        return b;
    }    
    public void setB(int b) {
        this.b = b;
    }
    public void display(){
        System.out.println("ehjg");
    }
    My(){}
    My(int a,int b){}
}
public class ReflectClass {
    public static void main(String[] args) {
        My m=new My();
        Class c=m.getClass();
        System.out.println(m.getClass());
        System.out.println(c.getDeclaredConstructors());
        System.out.println(c.getDeclaredFields());
        Constructor[] co = c.getDeclaredConstructors();
        for(Constructor cs:co){
            System.out.println(cs+" ");
        }
        System.out.println("fields \\");
        Field[] fs=c.getFields();
        for(Field f:fs){
            System.out.println(fs+" ");
        }
        System.out.println("methods \\");
        Method[] me=c.getDeclaredMethods();
        for(Method ma:me){
            System.out.println(ma+" ");
        }
    }
}
