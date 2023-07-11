package MultiThreading;
class Test extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("test");
        }
    }
}
public class MultiThreading6 {
    public static void main(String[] args) throws Exception{
       Test t=new Test();
       t.start();
       t.join();
       for(int i=0;i<10;i++){
           System.out.println("main");
       }
    }
}
