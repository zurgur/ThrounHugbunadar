package hi.is.vidmot;

import javax.swing.*;

/**
 * Created by Alexander on 16.3.2017.
 */
public class Login {
    private JButton newMemberButton;
    private JButton loginButton;
    private JFormattedTextField formattedTextField1;
    private JFormattedTextField formattedTextField2;
    private JPanel panel1;


    public void launch() {
        JFrame search = new JFrame("Search");
        search.setContentPane(new Login().panel1);
        search.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        search.pack();
        search.setVisible(true);
    }

}
