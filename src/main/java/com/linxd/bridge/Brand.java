package com.linxd.bridge;

/**
 * Created with IntelliJ IDEA.
 *
 * @author linxd
 * @date 2019/7/12 21:45
 * Description: No Description
 */
public interface Brand {
    void sale();
}
class Lenovo implements Brand {
    @Override
    public void sale() {
        System.out.println("卖联想电脑");
    }
}
class Dell implements Brand {
    @Override
    public void sale() {
        System.out.println("卖戴尔电脑");
    }
}
