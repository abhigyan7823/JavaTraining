/*simple Abstraction program to withdraw and deposit monet*/
package OOPS;
abstract class BankAccount{
    private String acc_no;
    private int bal;
    public BankAccount(String acc_no,int bal){
        this.acc_no=acc_no;
        this.bal=bal;
    }

    public String getAcc_no() {
        return acc_no;
    }

    public int getBalance() {
        return bal;
    }
    public void setBalance(int bal){
        this.bal=bal;
    }
    abstract void showBalance();
    abstract void deposit(int bal);
    abstract void withdraw(int bal);
}
class SavingAccount extends BankAccount{
    SavingAccount(String acc_no, int bal){
        super(acc_no,bal);
    }
    @Override
    public void deposit(int amount){
        setBalance(getBalance()+amount);
        System.out.println("Succesfully Deposited "+amount+" Currnet Balance "+getBalance());
    }
    @Override
    public void withdraw(int amount) {
        if(getBalance()>amount){
            setBalance(getBalance()-amount);
            System.out.println("Succesfullt Withdrwal "+amount+" Current Balance "+getBalance());
        }
        else{
            System.out.println("Not Sufficient fund to Withdrawl Money");
        }
    }
    @Override
    public void showBalance(){
        System.out.println(getBalance()+" ");
    }
}
class CurrentAccount extends BankAccount{
    CurrentAccount(String acc_no,int bal){
        super(acc_no,bal);
    }
    @Override
   public void deposit(int amount){
       setBalance(getBalance()+amount);
       System.out.println("Succesfully Deposited "+amount+" Currnet Balance "+getBalance());
   }
   public void withdraw(int amount){
       if(amount>getBalance()){
           System.out.println("Not Sufficient fund to Withdrawl Money");
       }
       else{
           setBalance(getBalance()-amount);
           System.out.println("Succesfully Withdrwal "+amount+" Current amount "+getBalance());
       }
   }
   @Override
   public void showBalance(){
        System.out.println(getBalance()+" ");
    }
}
public class AbstractClass2 {
    public static void main(String[] args) {
        BankAccount a1=new SavingAccount("1001",20000);
        a1.deposit(2000);
        a1.showBalance();
        BankAccount a2=new CurrentAccount("1002",30000);
        a2.withdraw(1);
        a2.withdraw(30000);
        a2.showBalance();
    }
}
