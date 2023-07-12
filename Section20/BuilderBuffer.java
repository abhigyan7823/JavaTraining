package Section20;
public class BuilderBuffer {
    public static void main(String[] args) {
        String s1=new String("harry");
        StringBuffer sb1=new StringBuffer("harry");
        StringBuilder sbi1=new StringBuilder("harry");
        //System.out.println(s1==sb1);
        /*if(sb1==sbi1){
            System.out.println(sb1);
        }*/
        s1+=" potter";
        System.out.println(s1);
        sb1.append(" potter");
        sbi1.append(" potter");
        System.out.println(sb1);
        System.out.println(sbi1);
    }
}
