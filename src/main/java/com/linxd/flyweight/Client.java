package com.linxd.flyweight;

/**
 * Created with IntelliJ IDEA.
 *
 * @author linxd
 * @date 2019/7/13 18:23
 * Description: 享元模式，将可以共享的（内部环境）和不可共享的（外部环境）分开，可共享的用工厂来存取，节省空间
 * 一般在框架中比较常见
 */
public class Client {
    public static void main(String[] args) {
        ChessFlyWeight chess1 = ChessFlyWeightFactoty.getChess("黑色");
        ChessFlyWeight chess2= ChessFlyWeightFactoty.getChess("黑色");
        ChessFlyWeight chess3 = ChessFlyWeightFactoty.getChess("白色");
        System.out.println(chess1);
        System.out.println(chess2);
        System.out.println(chess3);

        //同时当需要一个完整的对象时（可共享+不可共享），需要将非共享享元类对象传递给共享享元类，增加了耗时
        chess1.display(new Coordinate(10,10));
        chess2.display(new Coordinate(20,20));
        chess3.display(new Coordinate(30,30));
    }
}
