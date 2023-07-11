package MultiThreading;
class MyThread extends Thread{
    Thread t;
    public void run(){
        /*while(!Thread.interrupted()){
            System.out.println(Thread.currentThread().getId()+" ");
        }*/
        for(int i=0;i<50;i++){
            System.out.print(Thread.currentThread().getId()+" ");
        }
    }
}
public class MultiThreading4 {
    public static void main(String[] args) {
        MyThread th1=new MyThread();
        MyThread th2=new MyThread();
        MyThread th3=new MyThread();
        MyThread th4=new MyThread();
        /*System.out.println(th1.getState()+" ");
        System.out.println(th1.isAlive()+" ");
        th1.start();
        System.out.println(th1.isAlive()+" ");
        try{
            th1.sleep(1000);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println(th1.getState()+" ");
        System.out.println(th1.isAlive()+" ");
        th2.start();
        System.out.println(th2.getState()+" ");
        th1.interrupt();
        th2.interrupt();
        System.out.println(th1.isAlive()+" ");
        System.out.println(th2.isAlive()+" ");
        System.out.println(th1.getState()+" ");*/
        th3.start();
        th4.start();
        th3.setPriority(10);
        th4.setPriority(10);
        try{
            th3.join(1000);
        }
        catch(Exception e){
            System.out.println(e);
        }
        try{
            th3.yield();
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }
}
