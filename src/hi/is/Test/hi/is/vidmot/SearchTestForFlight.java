package hi.is.vidmot;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Alexander on 4/5/2017.
 */
public class SearchTestForFlight {
    @Test
    public void searchForFlight() throws Exception {
        Search search = new Search();
        assertEquals("keflavík alicante", search.searchForFlight("keflavík","alicante"));
    }

}