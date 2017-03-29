package hi.is.vidmot;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Alexander on 16.3.2017.
 */
public class Choose {
    // pannelið með tökkunum
    private JPanel panel1;
    //takki sem fer í leitar glugga
    private JButton searchButton;
    //takki sem fer í login glugga
    private JButton loginButton;

    private static JFrame adal = new JFrame("Choose");
    //bý til search út Serarch classa
    Search search = new Search();
    //by til login úr Login classa
    Login login = new Login();

    public Choose() {
        //atburðar handler fyrir search takka
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //lunch-a search glugga
                search.launch();
                //lokka þessum glugga
                close();
            }
        });
        //attburðar handler fyrir login takka
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //launch-a login glugga
                login.launch();
                //lokka þessum glugga
                close();
            }
        });
    }
    //fall sem lokar og tekur út þennan glugga
    private void close() {
        adal.setVisible(false);
        adal.dispose();
    }
    //aðal fall sem setur upp þennan glugga
    public static void main(String[] args) {
        adal.setContentPane(new Choose().panel1);
        adal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        adal.pack();
        adal.setVisible(true);
    }
}
