package java1;
import java.util.*;
public class prc4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        switch(str){
            case "sunday":System.out.println("1");
            break;
            case "monday":System.out.println("2");
            break;
            case "tuesday":System.out.println("3");
            break;
            default: System.out.println("Invalid");
        }
    }
}
