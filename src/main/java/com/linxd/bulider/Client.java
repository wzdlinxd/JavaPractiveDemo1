package com.linxd.bulider;

/**
 * Created with IntelliJ IDEA.
 *
 * @author linxd
 * @date 2019/7/11 21:51
 * Description: 建造者模式
 */
public class Client {
    public static void main(String[] args) {
        AirShip airShip = new LinxdAirShipDirector().directAirShip();
    }
}
