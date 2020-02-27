package Singleton;

/**
 * @description: 懒汉模式
 * @author: jasonlin
 * @create: 2020-02-26 22:34
 */
public class LazyDemo {

    public static LazyDemo lazy=null;

    public static LazyDemo getInstance() {
        if (lazy == null) {
            lazy = new LazyDemo();
        }
        return lazy;
    }
}
