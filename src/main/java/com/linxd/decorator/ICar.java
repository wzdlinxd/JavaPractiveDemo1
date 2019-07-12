package com.linxd.decorator;

/**
 * Created with IntelliJ IDEA.
 *
 * @author linxd
 * @date 2019/7/13 0:42
 * Description: 装饰模式的类结构
 */

/**
 * 抽象构件角色
 */
public interface ICar {
    void move();
}

/**
 * 具体构件角色
 */
class Car implements ICar {
    @Override
    public void move() {
        System.out.println("正常的跑");
    }
}

/**
 * 装饰角色
 */
class SuperCar implements ICar {

    protected ICar car;

    public SuperCar(ICar car) {
        this.car = car;
    }

    @Override
    public void move() {
        car.move();
    }
}

/**
 * 具体装饰角色
 */
class FlyCar extends SuperCar {

    public FlyCar(ICar car) {
        super(car);
    }

    public void fly() {
        System.out.println("可以飞");
    }

    @Override
    public void move() {
        car.move();
        this.fly();
    }
}

class WaterCar extends SuperCar {

    public WaterCar(ICar car) {
        super(car);
    }

    public void swim() {
        System.out.println("可以游");
    }

    @Override
    public void move() {
        car.move();
        this.swim();
    }
}
