package com.linxd.bulider;

/**
 * Created with IntelliJ IDEA.
 *
 * @author linxd
 * @date 2019/7/11 21:48
 * Description:Linxd牌的装配者
 */
public class LinxdAirShipDirector implements AirShipDirector {

    private AirShipBulider airShipBulider;

    @Override
    public AirShip directAirShip() {
        System.out.println("构建linxd飞船");
        AirShip airShip = new AirShip();
        airShipBulider = new LinxdAirShipBulider();
        airShip.setEngine(airShipBulider.createEngine());
        airShip.setModule(airShipBulider.createModule());
        airShip.setTower(airShipBulider.createTower());
        return airShip;
    }
}
