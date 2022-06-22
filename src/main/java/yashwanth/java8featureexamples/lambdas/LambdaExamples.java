package yashwanth.java8featureexamples.lambdas;

import yashwanth.java8featureexamples.common.Mobile;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class LambdaExamples {

    public static List<String> filterMobiles(List<Mobile> mobiles, Predicate<Mobile> predicate) {
        List<String> filteredMobiles = new ArrayList<>();
        for (Mobile mobile : mobiles) {
            if (predicate.test(mobile)) {
                filteredMobiles.add(mobile.getCompany() + " " + mobile.getModel());
            }
        }

        return filteredMobiles;
    }

    public static List<String> getAppleMobiles(List<Mobile> mobiles) {
        return filterMobiles(mobiles, mobile -> "Apple".equals(mobile.getCompany()));
    }

    public static List<String> getWhiteHighStorageMobiles(List<Mobile> mobiles) {
        return filterMobiles(mobiles, mobile -> "White".equals(mobile.getColor()) && mobile.getStorageInGB() > 64);
    }
}
