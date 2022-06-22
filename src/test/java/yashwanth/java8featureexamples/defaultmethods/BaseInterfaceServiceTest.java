package yashwanth.java8featureexamples.defaultmethods;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BaseInterfaceServiceTest {

    @Test
    public void testDefaultClassService() {
        assertEquals("I am base method", new DefaultClassService().baseMethod());
    }

    @Test
    public void testImplementedClassService() {
        assertEquals("I am implementedName from implemented class method", new ImplementedClassService("implementedName").baseMethod());
    }

    @Test
    public void testSubClassService() {
        assertEquals("I am sub class method", new SubClassService().baseMethod());
    }

    @Test
    public void testCombinedClassService() {
        assertEquals("I am base method", new CombinedClassService().baseMethod());
    }
}
