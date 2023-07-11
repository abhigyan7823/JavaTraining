/*Multithreading using Runnable Interface*/
package MultiThreading;
class My implements Runnable{
    public void run(){
        for(int i=0;i<50;i++)
            System.out.print(i+" ");
    }
    public void run1(){
        //System.out.println("");
        for(int i=0;i<50;i++){
            System.out.print(i+"h ");
        }
    }
}
public class MultiThreading2 {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            My m1=new My();
            Thread t1=new Thread(m1);
            t1.start();
            m1.run1();
        }
    }
}
