package com.linxd.adapter;

/**
 * Created with IntelliJ IDEA.
 *
 * @author linxd
 * @date 2019/7/12 9:24
 * Description: 适配器（对象适配方法）
 */
public class Adapter2 implements Target {

    private Adaptee adaptee;

    public Adapter2(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void handelReq() {
        adaptee.request();
    }
}
