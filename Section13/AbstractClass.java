/*Simple Abstraction program */
package OOPS;
abstract class Animal{
    public abstract void sound();
}
class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println("Barking....");
    }
}
class Cat extends Animal{
    @Override
    public void sound(){
        System.out.println("Meoww....");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        Animal a1=new Dog();
        a1.sound();
        Animal a2=new Cat();
        a2.sound();
    }   
}
