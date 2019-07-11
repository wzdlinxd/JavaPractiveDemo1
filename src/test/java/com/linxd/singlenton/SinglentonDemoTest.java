package com.linxd.singlenton;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @author linxd
 * @date 2019/7/11 16:19
 * Description: No Description
 */
public class SinglentonDemoTest {

    @Test
    public void test1() {
        SinglentonDemo1 a = SinglentonDemo1.getSinglentonDemo1();
        SinglentonDemo1 b = SinglentonDemo1.getSinglentonDemo1();
        SinglentonDemo1 c = SinglentonDemo1.getSinglentonDemo1();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    @Test
    public void test2() {
        SinglentonDemo2 a = SinglentonDemo2.getSinglentonDemo2();
        SinglentonDemo2 b = SinglentonDemo2.getSinglentonDemo2();
        SinglentonDemo2 c = SinglentonDemo2.getSinglentonDemo2();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
