package hi.is.Connect;

import java.sql.*;
import java.util.ArrayList;

/**
 * Created by Alexander on 16.3.2017.
 */
public class Connect {
    public static java.sql.Connection connection(){
        try{
            Class.forName("org.sqlite.JDBC");
            java.sql.Connection con = DriverManager.getConnection("jdbc:sqlite:flight.sqlite");
            Statement stmt =  con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Flights");
            return con;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    //skilar arry list með from
    public ArrayList<String> getFrom() {
        ArrayList<String> from = new ArrayList<>();

        try {
            java.sql.Connection con = connection();
            //tengist SQLite gagnagrunninum
            //gerir statement sem tekkur allt úr töfnunni
            Statement statement = con.createStatement();
            String s = "SELECT from" +
                    "FROM Flights"; //+

            //executar og finnur allt í töfnunni
            statement.execute(s);
            //hluur sem er með því sem kom út
            ResultSet rs = statement.getResultSet();
            //while sem fer í geggn um result göggnin
            while( rs.next() ) {
                String name = rs.getString("from");
                from.add(name);
            }
            // lokar gagnagruninnum svo hann geti verið nottaður afftur
            statement.close();
            con.close();
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
        return from;
    }
    //skilar arry lista með to
    public ArrayList<String> getTo() {
        ArrayList<String> from = new ArrayList<>();

        try {
            java.sql.Connection con = connection();
            //tengist SQLite gagnagrunninum
            //gerir statement sem tekkur allt úr töfnunni
            Statement statement = con.createStatement();
            String s = "SELECT from" +
                    "FROM Flights"; //+

            //executar og finnur allt í töfnunni
            statement.execute(s);
            //hluur sem er með því sem kom út
            ResultSet rs = statement.getResultSet();
            //while sem fer í geggn um result göggnin
            while( rs.next() ) {
                String name = rs.getString("to");
                from.add(name);
            }
            // lokar gagnagruninnum svo hann geti verið nottaður afftur
            statement.close();
            con.close();
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
        return from;
    }
}
