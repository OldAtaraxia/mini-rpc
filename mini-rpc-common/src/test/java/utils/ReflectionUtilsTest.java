package utils;

import junit.framework.TestCase;

import java.lang.reflect.Method;

public class ReflectionUtilsTest extends TestCase {

    public void testNewInstance() {
        TestClass t = ReflectionUtils.newInstance(TestClass.class);
        assertNotNull(t);
    }

    public void testGetPublicMethods() {
        Method[] publicMethods = ReflectionUtils.getPublicMethods(TestClass.class);
        assertEquals(1, publicMethods.length);
        assertEquals("b", publicMethods[0].getName());
    }

    public void testInvoke() {
        Method[] publicMethods = ReflectionUtils.getPublicMethods(TestClass.class);
        Method b = publicMethods[0];

        TestClass t = new TestClass();
        assertEquals("b", ReflectionUtils.invoke(t, b));
    }
}