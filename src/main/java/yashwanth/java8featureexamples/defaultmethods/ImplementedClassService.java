package yashwanth.java8featureexamples.defaultmethods;

public class ImplementedClassService implements BaseInterfaceService {

    private String fieldName;

    public ImplementedClassService(String fieldName) {
        this.fieldName = fieldName;
    }

    @Override
    public String baseMethod() {
        return "I am " + fieldName + " from implemented class method";
    }
}
