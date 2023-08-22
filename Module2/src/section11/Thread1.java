package section11;

public class Thread1 {
    public void show(){
        for(int i=0;i<1000;i++){
            System.out.print("show  ");
        }
    }
    public static void main(String[] args) {
        Thread1 t=new Thread1();
        Runnable r=t::show;
        Thread t1=new Thread(r);
        t1.start();
        for(int i=0;i<1000;i++){
            System.out.print("main  ");
        }
    }
}
