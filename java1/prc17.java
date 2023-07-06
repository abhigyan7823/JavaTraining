
package java1;
public class prc17 {
    int x,y;
    static void change(prc17 p){
        p.x=10;
        p.y=20;
    }
    public static void main(String[] args) {
        prc17 ob = new prc17();
        //int x,y;
        ob.x=1;
        ob.y=2;
        System.out.println("x = "+ob.x+"  "+"y ="+ob.y);
        change(ob);
        System.out.println("x = "+ob.x+"  "+"y ="+ob.y);
        //System.out.println(args[0]);
    }
}
