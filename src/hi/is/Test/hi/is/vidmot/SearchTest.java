package hi.is.vidmot;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;

import static org.junit.Assert.*;

/**
 * Created by Alexander on 3/30/2017.
 */
public class SearchTest {
    MockSearch search = new MockSearch();
    @Before
    //setur upp mock SearchTest
    public void before(){
        String [] fra = {"london", "alicante"};
        String [] til = {"alicante", "london"};
        search.setFra(fra);
        search.setTil(til);
    }

    //test fyrir Search
    @Test
    public void searchForFlight() throws Exception {
        // athugar hvort það finni flug milli london og alicante
        assertEquals("london alicante", search.searchForFlight("london", "alicante"));
    }

    //test fyrir Search
    @Test
    public void testNullCase() throws Exception {
        //testar hvað gerist ef það finnur ekkert
        assertNull(search.searchForFlight("asdf","adf"));
    }

    @After
    public void tearDown()
    {
        search.setFra(null);
        search.setTil(null);
    }
}