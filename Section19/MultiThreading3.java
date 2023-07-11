/*Priority of Thread*/
package MultiThreading;
class My extends Thread{
    public void run(){
        for(int i=0;i<500;i++){
            System.out.print(i+" ");
        }
    }
}
public class MultiThreading3 {
    public static void main(String[] args){
        My th1=new My();
        My th2=new My();
        My th3=new My();
        System.out.println(th1.getId() +"");
        System.out.println(th1.getName() +"");
        th1.setName("Harry");
        System.out.println(th1.isAlive()+"");
        System.out.println(th1.getName() +"");
        System.out.println(th1.getState() +"");
        //th1.start();
        //th2.start();
        System.out.println(th1.getPriority()+ " ");
        System.out.println(th1.getState() +"");
        System.out.println(th2.getPriority()+ " ");
        System.out.println(th3.getPriority()+ " ");
        th1.setPriority(1);
        System.out.println(th1.getState() +"");
        th2.setPriority(10);
        th3.setPriority(10);
        th1.start();
        System.out.println(th1.getState() +"");
        System.out.println(th1.getId() +"");
        th2.start();
        th3.start();
        System.out.println(th1.getId() +"");
        System.out.println(th1.isAlive()+"");
    }
}
