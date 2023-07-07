package Exception_Handling;
public class ExceptionHandling5 {
    public static void method1() throws Exception{
        int a=10;
        int b=0;
        if(b==0){
            //throw new Exception("error while dividing");
        }
        int c=a/b;
        System.out.println(c);
    }
   
    public static void main(String[] args) throws Exception {
        try{
            method1();
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("hello ");
    }
}
