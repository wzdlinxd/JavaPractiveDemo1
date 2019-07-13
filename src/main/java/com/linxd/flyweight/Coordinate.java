package com.linxd.flyweight;

/**
 * Created with IntelliJ IDEA.
 *
 * @author linxd
 * @date 2019/7/13 17:04
 * Description: 棋子的方位，非共享享元类（不能被共享的的子类）
 */
public class Coordinate {
    private int x,y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
