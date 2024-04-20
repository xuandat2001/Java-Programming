package Problem3;

import java.sql.*;
import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:sqlite:university.db");
       System.out.print("Enter the name: ");
        Scanner scanner = new Scanner(System.in);
        String full_name = scanner.nextLine();


        //Display the student who matches with the value in the database
        PreparedStatement ps = connection.prepareStatement("SELECT * "
                                                            + "FROM students "
                                                            + "WHERE full_name = ? ");
        ps.setString(1,full_name);
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            System.out.println(  rs.getInt("id")
                    + "\t" + rs.getString("full_name")
                    + "\t" + rs.getString("major"));
        }

        // Update the student data
        System.out.print("Enter the newName: ");
        String newName = scanner.nextLine();
        System.out.print("Enter the major: ");
        String major = scanner.nextLine();
        ps = connection.prepareStatement("UPDATE students "
                                            + "SET full_name = ? , major = ? "
                                            + "WHERE full_name = ? ");
        ps.setString(1, newName);
        ps.setString(2, major);
        ps.setString(3, full_name);
        ps.executeUpdate();
        Statement st = connection.createStatement();
        rs = st.executeQuery("SELECT * FROM students");

        while (rs.next()){
            System.out.println(  rs.getInt("id")
                    + "\t" + rs.getString("full_name")
                    + "\t" + rs.getString("major"));
        }
        st.close();
        ps.close();
        connection.close();
        System.out.println("Update database is finished!");
    }
}
