package com.linxd.bridge;

/**
 * Created with IntelliJ IDEA.
 *
 * @author linxd
 * @date 2019/7/12 17:22
 * Description: 桥接模式，将电脑的两个分类维度（类型、品牌）分开，通过组合的方式实现之前的多重继承，
 * 当需要增加某个维度的个数时，不影响另一个维度
 */
public class Client {
    public static void main(String[] args) {
        Computer2 computer = new DesktopComputer(new Lenovo());
        Computer2 computer2 = new LaptopComputer(new Dell());
        computer.sale();
        computer2.sale();
    }
}
