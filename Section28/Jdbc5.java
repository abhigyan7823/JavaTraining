package Section28;
import java.sql.*;
public class Jdbc5 {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Emp1","root","root");
            Statement st=con.createStatement();
            st.executeUpdate("create table logindetails(uname varchar(50) primary key,pass varchar(50));");
            con.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
