package com.linxd.flyweight;

/**
 * Created with IntelliJ IDEA.
 *
 * @author linxd
 * @date 2019/7/13 16:54
 * Description: 抽象享元类和具体享元类
 */
public interface ChessFlyWeight {
    void display(Coordinate coordinate);
    String getColor();
}

/**
 * 为内部状态（可共享的）提供成员变量的存储
 */
class Chess implements ChessFlyWeight {

    private String color;

    public Chess(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void display(Coordinate coordinate) {
        System.out.println("颜色：" + color);
        System.out.println("位置：" + coordinate.getX() + "-----" + coordinate.getY());
    }
}
