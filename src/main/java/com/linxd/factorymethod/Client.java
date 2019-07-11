package com.linxd.factorymethod;

/**
 * Created with IntelliJ IDEA.
 *
 * @author linxd
 * @date 2019/7/11 18:32
 * Description: 调用静态工厂获得对象
 */
public class Client {
    public static void main(String[] args) {
        Baoma baoma = (Baoma) new BaomaFactory().createCar();
        Benci benci = (Benci) new BenciFactory().createCar();
        baoma.run();
        benci.run();
    }
}
