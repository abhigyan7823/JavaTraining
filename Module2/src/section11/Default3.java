package section11;
import section10.*;
public class Default3{
    public static void main(String[] args) {
        Default3 d1=new Default3();
        d1.show();//gives compile time error as we can not access default method outside package
    }
}