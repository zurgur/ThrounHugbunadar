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

    //hlutir búnir til af form hlutnum
    private JPanel panel1;
    private JFormattedTextField departure;
    private JButton leitaButton;
    private JFormattedTextField aravial;
    private JComboBox day;
    Connect connect = new Connect();

    //
    public Search() {
        //atburðar handler fyrir leita takkann
        leitaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //prufa verður að hafa try og catch fyrir SQLite tengniguna
                try {
                    //nær í texta sem notandi hefur skráð inn fyrir departure.
                    String departureText = departure.getText();
                    //nær í texta sem notandi hefur skráð inn fyrir aravial
                    String aravialText = aravial.getText();
                    //tengist SQLite gagnagrunninum
                    Connection con =  connect.connection();
                    //gerir statement sem tekkur allt úr töfnunni
                    Statement statement = con.createStatement();
                    String s = "SELECT *" +
                            "FROM Flights"; //+

                    //executar og finnur allt í töfnunni
                    statement.execute(s);
                    //hluur sem er með því sem kom út
                    ResultSet rs = statement.getResultSet();
                    //while sem fer í geggn um result göggnin
                    while( rs.next() ) {
                        String name = rs.getString("from");
                        //athugar hvort hvort göggninn passa
                        if ( name.equals(departureText) ) {
                            System.out.println(name);
                        }
                    }
                    // lokar gagnagruninnum svo hann geti verið nottaður afftur
                    statement.close();
                    con.close();
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });
    }
    //fall til þess að leita af flugum
    //tekkur inn strengi
    //@return strendur:
    public void searchForFlight(String departure, String arrival){

    }
    public void launch() {
        JFrame search = new JFrame("Search");
        search.setContentPane(new Search().panel1);
        search.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        search.pack();
        search.setVisible(true);
    }

}
