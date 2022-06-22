package yashwanth.java8featureexamples.lambdas;

import org.junit.Test;
import yashwanth.java8featureexamples.common.Mobile;
import yashwanth.java8featureexamples.common.TestData;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LambdaExamplesTest {

    private List<Mobile> mobiles = TestData.listOfMobiles();

    @Test
    public void testAppleMobilesFilter() {
        List<String> actualMobiles = LambdaExamples.getAppleMobiles(mobiles);
        List<String> expectedMobiles = Arrays.asList("Apple iPhone6", "Apple iPhone7");
        assertEquals(expectedMobiles.toString(), actualMobiles.toString());
    }

    @Test
    public void testWhiteHighStorageMobilesFilter() {
        List<String> actualMobiles = LambdaExamples.getWhiteHighStorageMobiles(mobiles);
        List<String> expectedMobiles = Arrays.asList("Samsung S12");
        assertEquals(expectedMobiles.toString(), actualMobiles.toString());
    }
}
