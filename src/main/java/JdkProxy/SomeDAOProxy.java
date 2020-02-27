package JdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @description: Proxy of SomeDAO
 * @author: jasonlin
 * @create: 2020-02-27 10:05
 */
public class SomeDAOProxy implements InvocationHandler {

    private Object target;

    public SomeDAOProxy(Object target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("start transaction");
        method.invoke(target, args);
        System.out.println("commit transaction");
        return null;
    }
}
