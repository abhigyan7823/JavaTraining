package MultiThreading;

import java.util.logging.Level;
import java.util.logging.Logger;

class My extends Thread{
    int count=0;
    public void run(){
        while(true){
            /*try{
                thread.sleep(100);
            }
            catch(Exception e){
                System.out.println(e+" ");
            }*/
            //Thread.yield();
            System.out.println(count++ +"th1 ");
            
        }
    }
}
public class MultiThreading5{
    public static void main(String[] args) {
        My th1=new My();
        th1.start();
        int c=0;
        try {
            th1.join();
        } catch (InterruptedException e) {
                 System.out.println(e+"");//Logger.getLogger(MultiThreading5.class.getName()).log(Level.SEVERE, null, ex);
        }
        while(true){
            System.out.println(c++ +"main");
            //Thread.join(0x606);
            //Thread.yield();
        }
    }
}
