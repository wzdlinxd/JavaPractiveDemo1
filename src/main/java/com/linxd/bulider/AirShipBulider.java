package com.linxd.bulider;

/**
 * Created with IntelliJ IDEA.
 *
 * @author linxd
 * @date 2019/7/11 21:42
 * Description: 构建者的接口
 */
public interface AirShipBulider {
    Engine createEngine();
    Tower createTower();
    Module createModule();

}
