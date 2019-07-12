package com.linxd.dynamicproxy;

/**
 * Created with IntelliJ IDEA.
 *
 * @author linxd
 * @date 2019/7/12 9:47
 * Description: No Description
 */
public class RealStar implements Star {
    @Override
    public void sing() {
        System.out.println("realstar sing");
    }

    @Override
    public void run() {
        System.out.println("realstar run");
    }

    @Override
    public void say() {
        System.out.println("realstar say");
    }
}
