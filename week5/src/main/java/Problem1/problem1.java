package Problem1;

import java.sql.SQLException;
import java.sql.*;
public class problem1 {
    public static void main(String[] args) throws SQLException{
        Connection connection = DriverManager.getConnection("jdbc:sqlite:university.db");
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM students");

        while (rs.next()){
            System.out.println(  rs.getInt("id")
                    + "\t" + rs.getString("full_name")
                    + "\t" + rs.getString("major"));
        }
        st.close();
        connection.close();
        System.out.println("Reading database is finished!");
    }
}
