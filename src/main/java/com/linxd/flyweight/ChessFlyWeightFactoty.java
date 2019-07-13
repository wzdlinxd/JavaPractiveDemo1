package com.linxd.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @author linxd
 * @date 2019/7/13 17:57
 * Description: 享元工厂类
 */
public class ChessFlyWeightFactoty {
    //享元池
    private static Map<String, ChessFlyWeight> map = new HashMap<>();

    public static ChessFlyWeight getChess(String color) {
        if (map.get(color) != null) {
            return map.get(color);
        } else {
            ChessFlyWeight chess = new Chess(color);
            map.put(color, chess);
            return chess;
        }

    }
}
