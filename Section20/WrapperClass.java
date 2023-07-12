package Section20;
public class WrapperClass {
    public static void main(String[] args) {
        Integer a=10;
        Integer b=new Integer(2);
        Integer c=Integer.valueOf(14);
        Integer d=Integer.valueOf("14");
        System.out.println(a+" "+b+" "+c+" "+d);
        //System.out.println(c==b +" ");
        int a1=10;
        //System.out.println(a==a1+"");
        if(a==a1){
            System.out.println(a1+"");
        }
        if(b==a1){
            System.out.println(a1+"");
        }
        if(c==d){
            System.out.println(a1+"");
        }
        int b2=b;
        System.out.println("b=2"+b2);
        Integer e=a;
        System.out.println("e="+e);
        Double f=12.47;
        Character ch='a';
        Boolean flag=true;
        System.out.println(flag+"");
        
    }
}
