package Section28;
import java.util.Scanner;
import java.sql.*;
public class Jdbc6 {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Emp1","root","root");
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter UserName   ");
            String uname=sc.nextLine();
            System.out.println("Enter Password   ");
            String pass=sc.nextLine();
            PreparedStatement ps=con.prepareStatement("insert into logindetails values(?,?)");
            ps.setString(1,uname);
            ps.setString(2, pass);
            int i=ps.executeUpdate();
            con.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
