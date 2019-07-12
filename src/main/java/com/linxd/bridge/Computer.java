package com.linxd.bridge;

/**
 * Created with IntelliJ IDEA.
 *
 * @author linxd
 * @date 2019/7/12 21:34
 * Description: 未使用桥接模式的类复杂，对于有多个分类维度的东西，
 * 添加其中一个维度属性需要写很多代码
 */
public class Computer {
    public void sale() {
        System.out.println("卖电脑");
    }
}
class Desktop extends Computer {
    @Override
    public void sale() {
        System.out.println("卖台式电脑");
    }
}
class Laptop extends Computer {
    @Override
    public void sale() {
        System.out.println("卖笔记本电脑");
    }
}
class LenovoDesktop extends Desktop {
    @Override
    public void sale() {
        System.out.println("卖联想台式电脑");
    }
}
class DellDesktop extends Desktop {
    @Override
    public void sale() {
        System.out.println("卖戴尔台式电脑");
    }
}
class LenovoLaptop extends Laptop {
    @Override
    public void sale() {
        System.out.println("卖联想笔记本电脑");
    }
}
class DellLaptop extends Laptop {
    @Override
    public void sale() {
        System.out.println("卖戴尔笔记本电脑");
    }
}