package yashwanth.java8featureexamples.methodreference;

import yashwanth.java8featureexamples.common.Mobile;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/*
https://www.baeldung.com/java-8-double-colon-operator
 */
public class DoubleColonOperator {

    public static List<String> filterMobiles(List<Mobile> mobiles, Predicate<Mobile> predicate) {
        List<String> filteredMobiles = new ArrayList<>();
        for (Mobile mobile : mobiles) {
            if (predicate.test(mobile)) {
                filteredMobiles.add(mobile.getCompany() + " " + mobile.getModel());
            }
        }

        return filteredMobiles;
    }

    public static boolean isAppleMobile(Mobile mobile) {
        return "Apple".equals(mobile.getCompany());
    }
}
