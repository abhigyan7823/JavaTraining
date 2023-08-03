package Section28;
import java.util.Scanner;
import java.sql.*;
public class Jdbc7 {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Emp1","root","root");
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Your Uname");
            String uname=sc.nextLine();
            System.out.println("Enter Your Password");
            String pass=sc.nextLine();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from logindetails where uname='"+uname+"'and pass='"+pass+"'");
            if(rs.next()){
                System.out.println("Login Succesfull "+uname);
            }
            else{
                System.out.println("Invalid UserName");
            }
            con.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
