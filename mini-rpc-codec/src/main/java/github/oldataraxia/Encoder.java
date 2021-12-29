package github.oldataraxia;

/*
* 序列化接口
* */
public interface Encoder {
    /*
    * 将对象转换为字节数组
    * */
    byte[] encode(Object obj);
}
