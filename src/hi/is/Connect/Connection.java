package hi.is.Connect;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Alexander on 16.3.2017.
 */
public class Connection {
    public static java.sql.Connection connection(){
        try{
            Class.forName("org.sqlite.JDBC");
            java.sql.Connection con = DriverManager.getConnection("jdbc:sqlite:flight.sqlite");
            Statement stmt =  con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Flights");
            System.out.print("connected");
            return con;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
