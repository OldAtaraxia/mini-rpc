package github.oldataraxia;

/*
* 反序列化接口
* */
public interface Decoder {
    /*
    * 把字节数组反序列化成对象
    * */
    <T> T decode(byte[] bytes, Class<T> clazz);
}
