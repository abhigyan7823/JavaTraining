package Section28;
import java.sql.*;
public class Jdbc1 {
    public static void main(String[] args) throws Exception{
        //try{
        String url="jdbc:mysql://localhost:3306/Emp1";
        String uname="root";
        String pass="root";
        Class.forName("com.mysql.jdbc.Driver");
        try (Connection con = DriverManager.getConnection(url,uname,pass)) {
            Statement st=con.createStatement();
            //String sql="INSERT INTO Employee2 values(10)";
            //st.executeUpdate(sql);
            ResultSet rs=st.executeQuery("select * from Employee2");
            while (rs.next()) {
                System.out.println(rs.getString(1)+" "+rs.getInt(2));
            }
            //}
            /*
            catch(Exception e){
            System.out.println(e);
            }*/
        }
    }
}
