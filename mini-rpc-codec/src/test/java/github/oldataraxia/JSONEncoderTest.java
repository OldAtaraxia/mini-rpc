package github.oldataraxia;

import junit.framework.TestCase;
import org.junit.Test;

public class JSONEncoderTest extends TestCase {
    @Test
    public void testEncode() {
        Encoder encoder =  new JSONEncoder();
        TestBean bean = new TestBean();
        bean.setAge(10);
        bean.setName("test");

        byte[] bytes = encoder.encode(bean);
        assertNotNull(bytes);
    }
}