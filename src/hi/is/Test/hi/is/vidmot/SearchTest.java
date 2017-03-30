package hi.is.vidmot;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Alexander on 3/30/2017.
 */
public class SearchTest {
    MockSearch search = new MockSearch();
    @Before
    public void before(){
        String [] fra = {"london", "alicante"};
        String [] til = {"alicante", "london"};
        search.setFra(fra);
        search.setTil(til);
    }


    @Test
    public void searchForFlight() throws Exception {
        assertEquals("london alicante", search.searchForFlight("london", "alicante"));
    }

    @Test
    public void testNullCase() throws Exception {
        assertNull(search.searchForFlight("asdf","adf"));
    }
}