package hi.is.vidmot;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Alexander on 4/5/2017.
 */
public class SearchTestForFlight {
    Search search = new Search();
    @Before
    public void setjaupp() {
        ArrayList<String> fra = new ArrayList<>();
        ArrayList<String> til = new ArrayList<>();
        fra.add("a");
        fra.add("b");
        fra.add("c");
        fra.add("d");
        til.add("a");
        til.add("b");
        til.add("c");
        til.add("d");
        search.setjaUppFyrirTest(fra,til);
    }

    @Test
    public void searchForFlight() {
        ArrayList<String> svar = new ArrayList<>();
        svar.add("a a");
        assertEquals(svar, search.searchForFlight("a","a"));
    }
    @Test
    public void failSerce(){
        ArrayList<String> svar = new ArrayList<>();
        assertEquals(svar, search.searchForFlight("aaa","aba"));
    }

}