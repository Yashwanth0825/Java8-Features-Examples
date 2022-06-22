package yashwanth.java8featureexamples.streams;

import yashwanth.java8featureexamples.common.Mobile;

import java.util.Comparator;
import java.util.List;

public class StreamCollections {

    public static String cheapestMobile(List<Mobile> mobiles) {
        return mobiles.stream()
                .min(Comparator.comparing(Mobile::getPriceInAUDollar))
                .get().getModel();
    }

    public static int expensiveMobilePrice(List<Mobile> mobiles) {
        return mobiles.stream()
                .map(mobile -> mobile.getPriceInAUDollar())
                .reduce(0, Integer::max);
    }
}
