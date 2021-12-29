package github.oldataraxia;

import junit.framework.TestCase;
import org.junit.Test;

public class JSONDecoderTest extends TestCase {
    @Test
    public void testDecode() throws Exception {
        Encoder encoder =  new JSONEncoder();
        Decoder decoder = new JSONDecoder();
        TestBean bean = new TestBean();
        bean.setAge(10);
        bean.setName("test");

        byte[] bytes = encoder.encode(bean);
        TestBean bean2 = decoder.decode(bytes, TestBean.class);
        assertEquals(bean.getAge(), bean2.getAge());
        assertEquals(bean.getName(), bean2.getName());
    }
}
