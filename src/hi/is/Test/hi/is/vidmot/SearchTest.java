package hi.is.vidmot;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Alexander on 3/30/2017.
 */
public class SearchTest {
    @Before
    public void before(){
        Search search = new Search();

    }


    @Test
    public void searchForFlight() throws Exception {
        Search search = new Search();
        assertEquals("london alicante", search.searchForFlight("london", "alicante"));
    }

    @Test
    public void testNullCase() throws Exception {
        Search search = new Search();
        assertNull(search.searchForFlight("asdf","adf"));
    }
}