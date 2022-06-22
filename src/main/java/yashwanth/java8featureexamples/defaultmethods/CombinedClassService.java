package yashwanth.java8featureexamples.defaultmethods;

public class CombinedClassService implements BaseInterfaceService, AlternateBaseInterfaceService {

    @Override
    public String baseMethod() {
        return BaseInterfaceService.super.baseMethod();
    }
}
