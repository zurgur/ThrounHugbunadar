package hi.is.vidmot;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Alexander on 3/30/2017.
 */
public class MockSearch {
    // array fyrir hvert flugipð fer
    String [] til;
    // array fyrir hvaðan flugið kemur
    String [] fra;

    //letar að flugi
    //@return: String
    public String searchForFlight(String departure, String arrival){
        // fer í gegn um arry-ana
        for(int i = 0; i<fra.length;i++){
            for(int j = 0; j<til.length;j++){
                // ef það passar skilar það þvi sem streng
                if(fra[i].equals(departure) && til[j].equals(arrival)) {
                    return fra[i] + " " +til[j];
                }
            }
        }
        return null;
    }

    //föll sem setja arry-ana til og frá
    public void setTil(String [] s){
        til = s;
    }
    public void setFra(String [] s){
        fra = s;
    }
}
