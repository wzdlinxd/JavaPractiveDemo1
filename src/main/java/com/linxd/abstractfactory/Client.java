package com.linxd.abstractfactory;

/**
 * Created with IntelliJ IDEA.
 *
 * @author linxd
 * @date 2019/7/11 21:09
 * Description: 抽象工厂模式
 */
public class Client {
    public static void main(String[] args) {
        Engine luxuryEngine = new LuxuryCarFactory().createEngine();
        luxuryEngine.start();
    }

}
