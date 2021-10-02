import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DbConnexion {

    public static Connection conn;

    public static Connection getCnx() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver OK");

            String url = "jdbc:mysql://localhost:3306/endevtest";
            String user = "root";
            String passwd = "";

            conn = DriverManager.getConnection(url, user, passwd);
            System.out.println("Connexion effective !");

        } catch (Exception e) {

        }
        return conn;
    }





}
