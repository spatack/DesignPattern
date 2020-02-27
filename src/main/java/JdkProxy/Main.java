package JdkProxy;

import java.lang.reflect.Proxy;

/**
 * @description:
 * @author: jasonlin
 * @create: 2020-02-27 10:11
 */
public class Main {

    public static void main(String[] args) {
        //被代理对象
        SomeDAO someDAO = new SomeDAOImpl();
        SomeDAOProxy someDAOProxy = new SomeDAOProxy(someDAO);
        ClassLoader classLoader = someDAO.getClass().getClassLoader();
        Class<?>[] interfaces = someDAO.getClass().getInterfaces();
        // 主要装载器、一组接口及调用处理动态代理实例
        SomeDAO proxyDAO = (SomeDAO) Proxy.newProxyInstance(classLoader, interfaces, someDAOProxy);
        proxyDAO.update();
    }
}
