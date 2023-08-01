package Section28;
import java.sql.*;
public class Jdbc2 {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Emp1","root","root");
            PreparedStatement ps=con.prepareStatement("insert into Employee2 values(?,?)");
            ps.setString(1,"A");
            ps.setInt(2,11);
            ps.setString(1,"b");
            ps.setInt(2,13);
            int i=ps.executeUpdate();
            PreparedStatement ps1=con.prepareStatement("select * from Employee2");
            ResultSet rs=ps1.executeQuery();
            while(rs.next()){
                System.out.println(rs.getInt(2)+" "+rs.getString(1));
            }
            con.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
