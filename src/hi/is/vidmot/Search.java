package hi.is.vidmot;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import hi.is.Connect.*;

/**
 * Created by Alexander on 16.3.2017.
 */
public class Search {


    private JPanel panel1;
    private JFormattedTextField formattedTextField1;
    private JButton leitaButton;
    Connection connect = new Connection();

    public Search() {
        leitaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                connect.connection();
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
