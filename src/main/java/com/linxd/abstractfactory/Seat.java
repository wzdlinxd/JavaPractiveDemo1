package com.linxd.abstractfactory;

/**
 * Created with IntelliJ IDEA.
 *
 * @author linxd
 * @date 2019/7/11 21:05
 * Description: No Description
 */
public interface Seat {
    void seat();
}

class LuxurySeat implements Seat {
    @Override
    public void seat() {
        System.out.println("有按摩功能");
    }
}

class LowSeat implements Seat {
    @Override
    public void seat() {
        System.out.println("没有按摩功能");
    }
}