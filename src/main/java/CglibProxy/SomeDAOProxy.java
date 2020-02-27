package CglibProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @description: Proxy of SomeDAO
 * @author: jasonlin
 * @create: 2020-02-27 10:05
 */
public class SomeDAOProxy implements MethodInterceptor {

    private Object target;

    public Object getInstance(Object target) {
        // 设置需要创建子类的类
        this.target = target;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("start transaction");
        method.invoke(target, objects);
        System.out.println("commit transaction");
        return null;
    }
}
