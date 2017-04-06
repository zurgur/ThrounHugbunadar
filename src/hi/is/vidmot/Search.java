package hi.is.vidmot;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import hi.is.Connect.*;

import java.util.ArrayList;

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
    ArrayList<String> fra = connect.getFrom();
    ArrayList<String> til = connect.getTo();
    //
    public Search() {
        //atburðar handler fyrir leita takkann
        leitaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<String> s = searchForFlight(departure.getText(),aravial.getText());
                System.out.print(s);
            }
        });
    }
    //fall til þess að leita af flugum
    //tekkur inn strengi
    //@return strendur:
    public ArrayList<String> searchForFlight(String departure, String arrival){
        //prufa verður að hafa try og catch fyrir SQLite tengniguna
        // fer í gegn um arry-ana
        ArrayList<String> fraTil = new ArrayList<>();
        for(int i = 0; i<fra.size();i++){
            String s = fra.get(i);
            String t = til.get(i);
            if(s.equalsIgnoreCase(departure)&& t.equalsIgnoreCase(arrival)){
                fraTil.add(departure +" "+ arrival);
            }

        }
        return fraTil;
    }

    public void launch() {
        JFrame search = new JFrame("Search");
        search.setContentPane(new Search().panel1);
        search.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        search.pack();
        search.setVisible(true);
    }
    public void setjaUppFyrirTest(ArrayList s, ArrayList t){
        fra = s;
        til = t;
    }

}
