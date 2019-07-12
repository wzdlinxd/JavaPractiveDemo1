package com.linxd.bridge;

/**
 * Created with IntelliJ IDEA.
 *
 * @author linxd
 * @date 2019/7/12 21:46
 * Description: No Description
 */
public class Computer2 {
    protected Brand brand;

    public Computer2(Brand brand) {
        this.brand = brand;
    }

    public void sale() {
        System.out.println("卖电脑");
    }

    public Computer2() {
    }
}

class DesktopComputer extends Computer2 {

    public DesktopComputer(Brand brand) {
        super(brand);
    }

    public DesktopComputer() {
    }

    @Override
    public void sale() {
        System.out.println("卖台式电脑");
        brand.sale();
    }

}

class LaptopComputer extends Computer2 {

    public LaptopComputer(Brand brand) {
        super(brand);
    }

    public LaptopComputer() {
    }

    @Override
    public void sale() {
        System.out.println("卖笔记本电脑");
        brand.sale();
    }

}
