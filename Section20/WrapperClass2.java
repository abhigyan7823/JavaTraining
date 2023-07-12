package Section20;
public class WrapperClass2 {
    public static void main(String[] args) {
        Integer a1=Integer.valueOf("1001",2);
        System.out.println(a1+"");
        Integer a2=Integer.MAX_VALUE;
        System.out.println(a2+"");
        int a3=Integer.MIN_VALUE;
        System.out.println(a3+"");
        Integer sum=Integer.sum(a1, a3);
        System.out.println(sum+"");
        System.out.println(Integer.max(a2, a1)+"");
        System.out.println(Integer.parseInt("134")+"");
        int a4=4;
        System.out.println("    "+Float.MAX_EXPONENT+" ");
    }
}
