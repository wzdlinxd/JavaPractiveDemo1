package com.linxd.prototype;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @author linxd
 * @date 2019/7/11 23:25
 * Description: 原型模式
 */
public class Client {
    public static void main(String[] args) throws Exception {
        //浅复制
        /*Date date = new Date(4343123123L);
        Sheep sheep = new Sheep("少利",18,date);
        Sheep sheep1 = (Sheep) sheep.clone();
        date.setTime(123121331L);
        System.out.println(sheep);
        System.out.println(sheep1);*/

        //深复制
        Date date = new Date(4343123123L);
        Sheep2 sheep = new Sheep2("少利",18,date);
        Sheep2 sheep1 = (Sheep2) sheep.clone();
        date.setTime(123121331L);
        System.out.println(sheep);
        System.out.println(sheep1);
    }
}
