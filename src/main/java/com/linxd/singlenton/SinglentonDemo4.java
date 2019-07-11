package com.linxd.singlenton;

/**
 * Created with IntelliJ IDEA.
 *
 * @author linxd
 * @date 2019/7/11 16:12
 * Description: 双重检验锁式实现单例模式
 */
public class SinglentonDemo4 {

    private static class SinglentonClassInstance {
        private static final SinglentonDemo4 singlentonDemo4 = new SinglentonDemo4();
    }

    private SinglentonDemo4() {}

    public static synchronized SinglentonDemo4 getSinglentonDemo4() {

        return SinglentonClassInstance.singlentonDemo4;
    }
}
