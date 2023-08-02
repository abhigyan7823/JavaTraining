package Section28;
import java.sql.*;
public class Jdbc3 {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Emp1","root","root");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select Employee2.name, Employee2.id, emplocation1.city from Employee2 left join emplocation1 on Employee2.id=emplocation1.id;");
            while(rs.next()){
                System.out.println(rs.getString(1)+" "+rs.getInt(2)+" "+rs.getString(3));
            }
            con.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
        
    }
}
