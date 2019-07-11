package com.linxd.singlenton;

/**
 * Created with IntelliJ IDEA.
 *
 * @author linxd
 * @date 2019/7/11 16:12
 * Description: 双重检验锁式实现单例模式
 */
public class SinglentonDemo3 {

    private static SinglentonDemo3 singlentonDemo3 = null;

    private SinglentonDemo3() {}

    public static synchronized SinglentonDemo3 getSinglentonDemo2() {
        if (singlentonDemo3 == null) {
            SinglentonDemo3 sd = null;
            synchronized (SinglentonDemo3.class) {
                sd = singlentonDemo3;
                if (sd == null) {
                    synchronized (SinglentonDemo3.class) {
                        if (sd == null) {
                            sd = new SinglentonDemo3();
                        }
                    }
                    singlentonDemo3 = sd;
                }
            }//synchronized
        }
        return singlentonDemo3;
    }
}
