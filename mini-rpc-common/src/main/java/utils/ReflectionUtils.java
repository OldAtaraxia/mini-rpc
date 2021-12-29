package utils;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

public class ReflectionUtils {

    /*
    * 根据class获取对象实例
    * */
    public static <T> T newInstance(Class<T> clazz) {
        try {
            return clazz.newInstance();
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    /*
    * 获取类的公共方法
    * */
    public static Method[] getPublicMethods(Class<?> clazz) {
        Method[] methods = clazz.getDeclaredMethods(); // 当前类的所有方法, 不包括父类的方法
        List<Method> pmethods = new ArrayList<>();
        for(Method method : methods) {
            if(Modifier.isPublic(method.getModifiers())) {
                pmethods.add(method);
            }
        }
        return pmethods.toArray(new Method[0]);
    }

    /*
    * 调用某个对象的指定方法
    * 调用static方法时则obj传入null
    * */
    public static Object invoke(Object obj, Method method, Object... args) {
        try {
            return method.invoke(obj, args);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }
}
