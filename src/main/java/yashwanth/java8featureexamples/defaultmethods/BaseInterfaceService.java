package yashwanth.java8featureexamples.defaultmethods;

public interface BaseInterfaceService {

    default String baseMethod() {
        return "I am base method";
    }
}
