package Singleton;

/**
 * @description: 单例模式--饿汉模式
 * @author: jasonlin
 * @create: 2020-02-26 22:32
 */
public class HungryDemo {
    public static final HungryDemo hungry = new HungryDemo();

    public static HungryDemo getInstance() {
        return hungry;
    }
}
