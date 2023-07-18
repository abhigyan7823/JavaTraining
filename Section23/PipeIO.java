package Section23;
import java.io.*;
class Producer extends Thread{
    OutputStream os;
    public Producer(OutputStream o){
        os=o;
    }
    @Override
    public void run(){
        int count=1;
        while(true){
            try{
                os.write(count);
                os.flush();
                System.out.println("Producer "+count);
                System.out.flush();
                Thread.sleep(10);
                count++;
            }catch(Exception e){}
        }
    }  
}
class Consumer extends Thread{
    InputStream is;
    public Consumer(InputStream s){
        is=s;
    }
    @Override
    public void run(){
        int x;
        while(true){
            try{
             x=is.read();
                System.out.println("Consumer "+x);
                System.out.flush();
                Thread.sleep(10);
            }catch(Exception e){}
        }
    }   
}
public class PipeIO {
    public static void main(String[] args) throws Exception{
        PipedInputStream pis=new PipedInputStream();
        PipedOutputStream pos=new PipedOutputStream();
        pos.connect(pis);
        Producer p=new Producer(pos);
        Consumer c=new Consumer(pis);
        p.start();
        c.start();
    }
}
