package yashwanth.java8featureexamples.defaultmethods;

public interface AlternateBaseInterfaceService {

    default String baseMethod() {
        return "I am alternate base method";
    }
}
