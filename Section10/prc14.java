
package java1;
public class prc14 {
    static int data=100;
    static void up(int da){
        da=12;
    }
    int d=200;
    void update(int data){
        data =88;
    }
    /*static void updat(prc14 p){
        p.ab =10;
    }*/
    public static void main(String[] args) {
        System.out.println(data+" ");
        up(data);
        System.out.println(data+"");
        prc14 pr = new prc14();
        int a=10;
        pr.update(a);
        System.out.println(pr.d+"");
        /*updat(pr);
        System.out.println(pr.d+"");
        //prc14 pr=new prc14();
        int ab=10;
        pr.update(pr);
        System.out.println(pr.ab+" ");*/
    }
}
