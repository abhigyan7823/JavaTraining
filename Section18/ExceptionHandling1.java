package Exception_Handling;
public class ExceptionHandling1{
    public static void main(String[] args){
        int a=5;
        int b=0;
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("Hello");
        int c;
        try{
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println(e+"");
        }
        System.out.println("hello");
        int[] arr={1,2,3};
        try{
            System.out.println(arr[3]+"");
        }
        catch(Exception e){
            System.out.println(e+"");
        }
        System.out.println("hello");
    }
}
