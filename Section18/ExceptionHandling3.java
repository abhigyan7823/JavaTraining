package Exception_Handling;
class UserException extends Exception{
    String msg;
    UserException(String msg){
        super(msg);
        this.msg=msg;
    }
    
}
public class ExceptionHandling3{
    public static void main(String[] args){
        String id="user2";
        String password="12";
        try{
            if(id!="user1" || password!="1234"){
	        throw new UserException("No user found ");
            }
	}
	catch(UserException ex){
            System.out.println(ex);
	    System.out.println(ex.getMessage());
	}
    }
}
