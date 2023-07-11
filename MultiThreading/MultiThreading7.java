/*Synchronization*/
package MultiThreading;
class Resource{
    public String name;
    public synchronized void getAccess(){
        for(int i=0;i<1000;i++){
            System.out.println(Thread.currentThread()+"");
        }
    }
}
class ThreadRun extends Thread{
    Resource resource;
    ThreadRun(Resource obj){
        resource = obj;
    }
    @Override
    public void run(){
        resource.getAccess();
    }
}

public class MultiThreading7 {
    public static void main(String[] args) {
        Resource obj = new Resource();
        ThreadRun t1 = new ThreadRun(obj);
        ThreadRun t2 = new ThreadRun(obj);
        t1.start();
        t2.start();
    }
}
