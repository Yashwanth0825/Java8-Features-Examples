package yashwanth.java8featureexamples.methodreference;

import org.junit.Test;
import yashwanth.java8featureexamples.common.Mobile;
import yashwanth.java8featureexamples.common.TestData;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class DoubleColonOperatorTest {

    private List<Mobile> mobiles = TestData.listOfMobiles();

    @Test
    public void testFilterMobiles() {
        List<String> actualMobiles = DoubleColonOperator.filterMobiles(mobiles, DoubleColonOperator::isAppleMobile);
        List<String> expectedMobiles = Arrays.asList("Apple iPhone6", "Apple iPhone7");
        assertEquals(expectedMobiles.toString(), actualMobiles.toString());
    }
}
