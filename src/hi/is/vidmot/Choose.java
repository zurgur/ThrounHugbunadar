package hi.is.vidmot;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Alexander on 16.3.2017.
 */
public class Choose {
    private JPanel panel1;
    private JButton searchButton;
    private JButton loginButton;

    private static JFrame adal = new JFrame("Choose");
    Search search = new Search();
    Login login = new Login();

    public Choose() {
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                search.lunch();
                close();
            }
        });
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                login.lunch();
                close();
            }
        });
    }

    private void close() {
        adal.setVisible(false);
        adal.dispose();
    }
    public static void main(String[] args) {
        adal.setContentPane(new Choose().panel1);
        adal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        adal.pack();
        adal.setVisible(true);
    }
}
