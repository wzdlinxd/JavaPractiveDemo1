package com.linxd.factorymethod;

/**
 * Created with IntelliJ IDEA.
 *
 * @author linxd
 * @date 2019/7/11 19:56
 * Description: No Description
 */
public class BenciFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Benci();
    }
}
