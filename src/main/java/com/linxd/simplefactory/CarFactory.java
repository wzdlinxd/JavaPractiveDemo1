package com.linxd.simplefactory;

/**
 * Created with IntelliJ IDEA.
 *
 * @author linxd
 * @date 2019/7/11 18:30
 * Description: 静态工厂类
 */
public class CarFactory {
    public static Benci getBenci() {
        return new Benci();
    }
    public static Baoma getBaoma() {
        return new Baoma();
    }
}
