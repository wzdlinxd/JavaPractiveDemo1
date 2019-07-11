package com.linxd.abstractfactory;

/**
 * Created with IntelliJ IDEA.
 *
 * @author linxd
 * @date 2019/7/11 21:02
 * Description: No Description
 */
public interface Engine {
    void start();
}

class LuxuryEngine implements Engine {
    @Override
    public void start() {
        System.out.println("启动快");
    }
}

class LowEngine implements Engine {
    @Override
    public void start() {
        System.out.println("启动慢");
    }
}