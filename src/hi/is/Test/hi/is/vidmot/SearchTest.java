package hi.is.vidmot;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Alexander on 3/30/2017.
 */
public class SearchTest {
    @Test
    public void searchForFlight() throws Exception {
        Search search = new Search();
        assertEquals("london keflavík", search.searchForFlight("london", "keflavík"));
    }


}