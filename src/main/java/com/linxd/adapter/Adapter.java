package com.linxd.adapter;

/**
 * Created with IntelliJ IDEA.
 *
 * @author linxd
 * @date 2019/7/12 9:19
 * Description: 适配器（类适配器方法）
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void handelReq() {
        super.request();
    }
}
