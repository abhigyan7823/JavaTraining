/*user defined exception for money withdraw*/
package Exception_Handling;
class LowBalanceException extends Exception{
    public String toString(){
        return "Min Balance should be 1000";
    }
}
public class ExceptionHandling4 {
    public static void main(String[] args) {
        int bal=10000;
        int withdraw=9500;
        try{
            if(bal-withdraw<1000){
                throw new LowBalanceException();
            }
            else{
                bal-=withdraw;
                System.out.println("new Balance "+bal);
            }
        }
        catch(LowBalanceException e){
            System.out.println(e+"");
        }
    }
}
