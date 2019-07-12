package com.linxd.staticproxy;

/**
 * Created with IntelliJ IDEA.
 *
 * @author linxd
 * @date 2019/7/12 9:50
 * Description: 静态代理模式
 */
public class Client {
    public static void main(String[] args) {
        RealStar realStar = new RealStar();
        ProxyStar proxyStar = new ProxyStar(realStar);
        proxyStar.run();
        proxyStar.say();
        proxyStar.sing();
    }

}
