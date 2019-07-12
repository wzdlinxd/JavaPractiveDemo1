package com.linxd.dynamicproxy;

import java.lang.reflect.Proxy;

/**
 * Created with IntelliJ IDEA.
 *
 * @author linxd
 * @date 2019/7/12 17:22
 * Description: 动态代理模型
 */
public class Client {
    public static void main(String[] args) {
        Star realStar = new RealStar();
        StarHandler starHandler = new StarHandler(realStar);
        Star proxy = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Star.class}, starHandler);
        proxy.sing();
    }
}
