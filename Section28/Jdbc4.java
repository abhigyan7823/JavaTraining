package Section28;
import java.sql.*;
public class Jdbc4 {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Emp1","root","root");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select count(city) from emplocation");
            if(rs.next()){
                System.out.println(rs.getInt(1));
            }
            con.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }
}
