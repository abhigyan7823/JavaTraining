package Section20;
public class WrapperClass3 {
    Integer i=10;
    void change(Integer i){
        i=200;
    }
    public static void main(String[] args) {
        WrapperClass3 a=new WrapperClass3();
        //Integer i=10;
        a.change(a.i);
        System.out.println(a.i);
    }
}
