package com.linxd.bulider;

/**
 * Created with IntelliJ IDEA.
 *
 * @author linxd
 * @date 2019/7/11 21:45
 * Description: Linxd牌的构建者
 */
public class LinxdAirShipBulider implements AirShipBulider {
    @Override
    public Engine createEngine() {
        System.out.println("构建linxd发动机");
        return new Engine("linxd发动机");
    }

    @Override
    public Tower createTower() {
        System.out.println("构建linxd逃逸塔");
        return new Tower("linxd逃逸塔");
    }

    @Override
    public Module createModule() {
        System.out.println("构建linxd轨道舱");
        return new Module("linxd轨道舱");
    }
}
