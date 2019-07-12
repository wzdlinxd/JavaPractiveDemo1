package com.linxd.decorator;

/**
 * Created with IntelliJ IDEA.
 *
 * @author linxd
 * @date 2019/7/13 0:49
 * Description: 装饰模式，再Java中，io流就是很典型的装饰模式
 */
public class Client {
    public static void main(String[] args) {
        Car car = new Car();
        car.move();
        System.out.println("--------------------");
        WaterCar waterCar = new WaterCar(new Car());
        waterCar.move();
        System.out.println("--------------------");
        FlyCar flyCar = new FlyCar(new WaterCar(new Car()));
        flyCar.move();
    }
}
