package com.linxd.staticproxy;

/**
 * Created with IntelliJ IDEA.
 *
 * @author linxd
 * @date 2019/7/12 9:48
 * Description: 静态代理类
 */
public class ProxyStar implements Star {

    private RealStar realStar;

    public ProxyStar(RealStar realStar) {
        this.realStar = realStar;
    }

    @Override
    public void sing() {
        realStar.sing();
    }

    @Override
    public void run() {
        System.out.println("procystar sing");
    }

    @Override
    public void say() {
        System.out.println("procystar say");
    }
}
