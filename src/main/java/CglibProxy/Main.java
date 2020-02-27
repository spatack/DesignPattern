package CglibProxy;

/**
 * @description:
 * @author: jasonlin
 * @create: 2020-02-27 10:23
 */
public class Main {

    public static void main(String[] args) {
        SomeDAOProxy proxy = new SomeDAOProxy();
        SomeDAO prxy = (SomeDAO) proxy.getInstance(new SomeDAOImpl());
        prxy.update();
    }
}
