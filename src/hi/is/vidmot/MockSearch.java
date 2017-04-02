package hi.is.vidmot;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Alexander on 3/30/2017.
 */
public class MockSearch {
    String [] til;
    String [] fra;
    public String searchForFlight(String departure, String arrival){
        for(int i = 0; i<fra.length;i++){
            for(int j = 0; j<til.length;j++){
                if(fra[i].equals(departure) && til[j].equals(arrival)) {
                    return fra[i] + " " +til[j];
                }
            }
        }
        return null;
    }
    public void setTil(String [] s){
        til = s;
    }
    public void setFra(String [] s){
        fra = s;
    }
}
