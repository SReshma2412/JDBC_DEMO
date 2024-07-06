import java.sql.*;

public class Jdbc_student {
    public static void main(String[] args) throws SQLException {
        String url="jdbc:mysql://localhost:3306/jdbcdemo";
        String userName="root";
        String password="Sureshresh76";
        String query="select * from student";
        Connection con= DriverManager.getConnection(url,userName,password);
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(query);
        while (rs.next())
        {
            System.out.println("Id is: "+rs.getInt(1));
            System.out.println("Name is: "+rs.getString(2));
            System.out.println("Gpa is: "+rs.getFloat(3));
        }
        con.close();
    }
}
