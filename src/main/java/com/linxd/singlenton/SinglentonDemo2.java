package com.linxd.singlenton;

/**
 * Created with IntelliJ IDEA.
 *
 * @author linxd
 * @date 2019/7/11 16:12
 * Description: 懒汉式实现单例模式
 */
public class SinglentonDemo2 {

    private static SinglentonDemo2 singlentonDemo2 = null;

    private SinglentonDemo2() {}

    public static synchronized SinglentonDemo2 getSinglentonDemo2() {
        if (singlentonDemo2 == null) {
            singlentonDemo2 = new SinglentonDemo2();
        }
        return singlentonDemo2;
    }
}
