// JDBC Example
import java.sql.*;

public class JDBCExample {
    public static void main(String[] args) {
        try {
            // Load the MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to your database (change credentials as needed)
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bca_db", "root", "password");

            String sql = "INSERT INTO students (name, rollNo) VALUES (?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "GurpreetKaur");
            ps.setInt(2, 9);

            int rows = ps.executeUpdate();
            if (rows > 0)
                System.out.println("Connection Successful and Record Inserted!");

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
