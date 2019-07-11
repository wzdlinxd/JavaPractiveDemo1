package com.linxd.abstractfactory;

/**
 * Created with IntelliJ IDEA.
 *
 * @author linxd
 * @date 2019/7/11 21:07
 * Description: 汽车工厂接口
 */
public interface CarFactory {
    Engine createEngine();
    Seat createSeat();
}
