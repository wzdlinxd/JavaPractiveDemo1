package com.linxd.singlenton;

/**
 * Created with IntelliJ IDEA.
 *
 * @author linxd
 * @date 2019/7/11 16:12
 * Description: 饿汉式实现单例模式
 */
public class SinglentonDemo1 {

    private static final SinglentonDemo1 singlentonDemo1 = new SinglentonDemo1();

    private SinglentonDemo1 () {}

    public static SinglentonDemo1 getSinglentonDemo1() {
        return singlentonDemo1;
    }

}

