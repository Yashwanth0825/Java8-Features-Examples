package yashwanth.java8featureexamples.streams;

import org.junit.Test;
import yashwanth.java8featureexamples.common.Mobile;
import yashwanth.java8featureexamples.common.TestData;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class StreamCollectionsTest {

    private List<Mobile> mobiles = TestData.listOfMobiles();

    @Test
    public void testCheapestMobile() {
        assertEquals("8T", StreamCollections.cheapestMobile(mobiles));
    }

    @Test
    public void testExpensiveMobile() {
        assertEquals(1500, StreamCollections.expensiveMobilePrice(mobiles));
    }
}
