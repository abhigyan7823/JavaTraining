package section2;
interface Addable{  
    int add(int a,int b);  
}
public class Lam2 {
    public static void main(String[] args) {
        Addable ad1=(a,b)->(a+b);  
        System.out.println(ad1.add(10,20));  
    }
}
