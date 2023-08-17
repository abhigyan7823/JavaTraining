package section9;
import java.util.function.Supplier;
public class Passgen {
    public static void main(String[] args) {
        Supplier<String> sup=()->{
          String pass="";
          String low="";
          String up="";
          String sp="@#$";
          String num="1234567890";
          for(int i=65;i<=90;i++){
              low+=(char)i;
          }
          for(int i=97;i<=122;i++){
              up+=(char)i;
          }
          for(int i=1;i<=8;i++){
              int ran=(int)(1+(Math.random()*4));
              if(ran==1){
                  int tamp=(int)(Math.random()*26);
                  pass+=low.charAt(tamp);
              }
              if(ran==2){
                  int tamp=(int)(Math.random()*26);
                  pass+=up.charAt(tamp);
              }
              if(ran==3){
                  int tamp=(int)(Math.random()*3);
                  pass+=sp.charAt(tamp);
              }
              if(ran==4){
                  int tamp=(int)(Math.random()*9);
                  pass+=num.charAt(tamp);
              }
          }
          return pass;
        };
        System.out.println(sup.get());
        System.out.println(sup.get());
        System.out.println(sup.get());
        System.out.println(sup.get());
        System.out.println(sup.get());
        System.out.println(sup.get());
        System.out.println(sup.get());
        
        
        /*String pass="";
        
          for(int i=65;i<=90;i++){
              pass+=(char)i;
          }
          System.out.println(pass);*/
    }
}
