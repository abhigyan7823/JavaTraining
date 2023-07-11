/*MultiThreading using thread class*/
package MultiThreading;
class My extends Thread{
    @Override
    public void run(){
        for(int i=0;i<50;i++){
            System.out.print(i+" ");
            //System.out.println(Thread.currentThread().getId());
        }    
    }
}
public class MultiThreading1 {
    public void display(){
        for(int i=0;i<100;i++){
            System.out.println(i+"hello");
        }
    }
    public static void main(String[] args) {
        /*My t1=new My();
        t1.start();
        My t2=new My();
        t2.start();
        MultiThreading1 m=new MultiThreading1();
        m.display();
        MultiThreading1 m1=new MultiThreading1();
        m1.display();*/
        for (int i=0;i<10;i++){
            My obj = new My();
            obj.start();
        }
    }
}
