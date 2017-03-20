package hi.is.vidmot;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import hi.is.Connect.*;
import java.sql.*;

/**
 * Created by Alexander on 16.3.2017.
 */
public class Search {


    private JPanel panel1;
    private JFormattedTextField departure;
    private JButton leitaButton;
    private JFormattedTextField aravial;
    private JComboBox day;
    Connect connect = new Connect();

    public Search() {
        leitaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    String departureText = departure.getText();
                    String aravialText = aravial.getText();
                    Connection con =  connect.connection();
                    Statement statement = con.createStatement();
                    String s = "SELECT *" +
                            "FROM Flights";
                    statement.execute(s);
                    ResultSet rs = statement.getResultSet();
                    while( rs.next() ) {
                        String name = rs.getString("Arrival");
                        System.out.println(name);
                    }
                    statement.close();
                    con.close();
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });
    }

    public void lunch() {
        JFrame search = new JFrame("Search");
        search.setContentPane(new Search().panel1);
        search.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        search.pack();
        search.setVisible(true);
    }

}
