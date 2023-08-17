package section9;
import java.util.function.Supplier;
public class Otpgen {
    public static void main(String[] args) {
        Supplier<Integer> otp=()->{
          int num=(int)(1+Math.random()*9);
          for(int i=1;i<=5;i++){
              num=(num*10)+(int)(Math.random()*9);
          }
          return num;
        };
        System.out.println(otp.get());
        System.out.println(otp.get());
        System.out.println(otp.get());
        System.out.println(otp.get());
        System.out.println(otp.get());
        System.out.println(otp.get());
        System.out.println(otp.get());
        System.out.println(otp.get());
        System.out.println(otp.get());
        System.out.println(otp.get());
        System.out.println(otp.get());
        
    }
}
